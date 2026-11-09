package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server 
{
    private static final int PORT = 5001;
    private static final int MAX_CONNECTIONS = 100;

    public static void main(String args[]) throws Exception
    {
        //Create a thread to manage connections
        //ExecutorService pool = Executors.newFixedThreadPool(MAX_CONNECTIONS);

        

        try(ServerSocket server = new ServerSocket(PORT))
        {
            //show the server is running
            System.out.println("Server running");

            //listen for new connections
            while(true){
                //accept the connectionf rom the client
                Socket client = server.accept();
                System.out.println("New Client connected:" + client.getRemoteSocketAddress()); 
                
                //say hello to the client
                OutputStream out = client.getOutputStream();
                PrintWriter writer = new PrintWriter(out);
                writer.println("You connected to my server?!\nHow dare you?!");
                writer.flush();
                writer.close();

            } 
        }catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
        }
    }

}
