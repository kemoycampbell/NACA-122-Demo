package httpPackage;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpRequestParser 
{
    public static HttpRequest parseRequest(HttpStream stream)
    {
        //read the first line and split it into 3 parts
        //first line structure
        //GET / HTTP/1.1
        String firstLine = stream.readLine();
        String[] tokens = firstLine.split(" ");

        String methodString = tokens[0];
        String uri = tokens[1];

        Method method = Method.valueOf(methodString);
        Map<String, String> header = HttpRequestParser.parseHeader(stream);
        String body = HttpRequestParser.parseBody(stream, header);


        return new HttpRequest(method, uri, header, body);
    }

    public static Map<String, String> parseHeader(HttpStream stream)
    {
        //returning a empty hash map for now
        return stream.lines()
        //split the lines and limit the values to 2 at a time
        .map(line-> line.split(": ", 2))
        //we will lower each key but leave the value unmodified
        .collect(Collectors.toMap(kvp-> kvp[0].toLowerCase(), kvp-> kvp[1]));

        //you can also use loop to achieve the above behaviors
    }

    public static String parseBody(HttpStream stream, Map<String, String> headers)
    {
        return null;
    }

    // public static void main(String args[])throws Exception
    // {
    //     ServerSocket server = new ServerSocket(8081);
    //     Socket client = server.accept();
    //     InputStream in = client.getInputStream();

    //     //wrap it in the custom HTTPStream to preven autoclose
    //     //of the socket
    //     HttpStream httpStream = new HttpStream(in);

    //    System.out.println(httpStream.readLine());
    // }
}
