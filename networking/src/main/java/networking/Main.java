package networking;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception{

        //localhost stuff
       System.out.println("Localhost Stuff");
       InetAddress localhost = InetAddress.getLocalHost();
       String hostname = localhost.getHostName();
       String address = localhost.getHostAddress();
       System.out.println(String.format("hostname:%s, address:%s", hostname, address));

       InetAddress rit = InetAddress.getByName("rit.edu");

       System.out.println("\n\nRIT Stuff");
       hostname = rit.getHostName();
       address = rit.getHostAddress();

       System.out.println(String.format("hostname:%s, address:%s", hostname, address));
    }
}