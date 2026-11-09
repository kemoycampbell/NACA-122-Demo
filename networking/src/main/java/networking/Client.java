package networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client 
{
    public static void main(String args[]) throws Exception
    {
        Socket socket = new Socket("127.0.0.1", 5001);

        //process the message we received from the server
        // InputStream in = socket.getInputStream();
        // Scanner scanner = new Scanner(in);

        // //as long as there are more messages, we will print them
        // while(scanner.hasNextLine()){
        //     System.out.println(scanner.nextLine());
        // }
        
        // scanner.close();
        // socket.close();

        OutputStream stream = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            
            System.out.print("Enter your message:");
            String message = scanner.nextLine();
            writer.println(message);
            writer.flush();

            //implement your own break out logic outside of class
        }

        //this is left up as an exercise for break out
        //scanner.close();
    }
}
