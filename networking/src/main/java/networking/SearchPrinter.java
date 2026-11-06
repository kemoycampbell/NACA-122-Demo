package networking;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SearchPrinter 
{
    public static void main(String args[]) throws Exception
    {
        //use URI("url").toURL() because new URL("hostname") is deprecated and no longer encouraged since version 20

        //setup the URL object of what we want to access
        URL url = new URI("https://duckduckgo.com/").toURL();

        //setup a open connection
        URLConnection connection = url.openConnection();

        //add the header for the user agent as some browser and website block certain user agents that are not browser based
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; Android 16; Pixel 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Mobile Safari/537.36");

        //connect
        connection.connect();

        //Get the data stream from the connection
        InputStream inputStream = connection.getInputStream();

        //use the Scanner to process the data
        Scanner scanner = new Scanner(inputStream);

        //go through the stuff as long as there are data
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();


    }

}
