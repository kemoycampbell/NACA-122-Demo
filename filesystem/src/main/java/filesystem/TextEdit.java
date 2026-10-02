package filesystem;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEdit 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename:");
        String filename = scanner.nextLine();

        try{
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter writer = new PrintWriter(fileWriter);
            while(true) {
                System.out.println("Enter your content:");
                String content = scanner.nextLine();
                if(content.equals(""))
                    break;

                writer.println(content);
            }

            writer.close();
            scanner.close();
            fileWriter.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("The filename " + filename + " was not found!");
        }catch(IOException e)
        {
            System.out.println("An exception occurred during the reading/writing!");
        }
    }

}
