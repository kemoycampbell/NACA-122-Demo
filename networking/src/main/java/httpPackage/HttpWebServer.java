package httpPackage;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

public class HttpWebServer 
{
    public int port;

    public HttpWebServer(int port)
    {
        this.port = port;
    }

    public void start()throws Exception
    {
        ServerSocket server = new ServerSocket(port);
        while(true){
            //accept a client connection
            Socket client = server.accept();
            handleClient(client);

        }
    }

    public void handleClient(Socket clientSocket)throws Exception
    {
        HttpStream in = new HttpStream(clientSocket.getInputStream());
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());

        HttpRequest request = HttpRequestParser.parseRequest(in);
        String parsedRequest = handleRequest(request);
        String response;

        if(parsedRequest== null)
            response = HttpResponseBuilder.buildNotFoundErrorResponse(request.getUri() + " not found");
        else
            response = HttpResponseBuilder.buildSuccessResponse(parsedRequest);


        sendResponse(writer, response);
        clientSocket.close();
        System.out.println("Request:" + request);
    }

    public String handleRequest(HttpRequest request)
    {
        //if the request is not "/" we return a null
        if(!request.getUri().equals("/"))
            return null;


        //parse out the body from the request
        String body = request.getBody();
        String separator = "&";
        String[] tokens = body.split(separator);
        
        //setup today day and minus 21 from it, a person have to born before that to be able to drink
        LocalDate today = LocalDate.now();
        LocalDate drinkingCutOffDate = today.minusYears(21);


        //get out the birday info, the info is like year=2000
        String birthYear = tokens[0].split("=")[1];
        String birthMonth = tokens[1].split("=")[1];
        String birthDay = tokens[2].split("=")[1];

        LocalDate birthday = LocalDate.parse(String.format("%s-%s-%s", birthYear,birthMonth,birthDay));

        //if they born after the 21 year, then they cant drink
        if(birthday.isAfter(drinkingCutOffDate)){
            return "<html><body><h1>Sorry!</h1><p>You are not old enough to drink.</p></body></html>";

        }

        return "<html><body><h1>Unc</h1><p>Please drink responsibly!!</p></body></html>";
    }

    public void sendResponse(PrintWriter writer, String response)
    {
        writer.println(response);
        writer.flush();
        System.out.println("Response:" + response);
    }

    public static void main(String args[])throws Exception
    {
        HttpWebServer server = new HttpWebServer(8081);
        server.start();
    }
}
