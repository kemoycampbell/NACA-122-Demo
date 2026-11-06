package networking;

import java.net.Socket;

public class Connector 
{
    public static void main(String args[]) throws Exception
    {
        String[] endpoints = {
            "www.google.com/80",
            "www.npr.org/443",
            "gcis-124.rit.edu/33075"
        };

        Socket sock;

        for(String endpoint: endpoints)
        {
            String[] endpointInfo = endpoint.split("/");
            String hostname = endpointInfo[0];
            int port = Integer.parseInt(endpointInfo[1]);

            sock = new Socket(hostname, port);
            sock.close();
            System.out.println("Successfully connected to :" + endpoint);
        }
    }

}
