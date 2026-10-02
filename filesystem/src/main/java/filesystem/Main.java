package filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // File file = new File("data/nyc_voter_records.csv");
        // System.out.println(file.exists());\
        //String filename = "data/nyc_voter_records.csv";
        //printFile(filename);

        String[] contents = {
            "Hello World",
            "NACA-122",
            "I Need money!"
        };
        writeContentToFile("data/magic.txt", contents);
    }

    public static void writeContentToFile(String filename, String[] contents) throws IOException
    {
        FileWriter writer = new FileWriter(filename);
        //leaving as challenge to use stream to write to file
        for
        (String content: contents)
        {
            writer.write(content+"\n");
        }
        writer.flush();
        writer.close();
        System.out.println("Finished write to file. All stuff closed");
    }

    public static void printFile(String filename) throws FileNotFoundException, IOException
    {
        //option 1: Handle the exception with the try/catch
        // try{
        //     FileReader reader = new FileReader(filename);
        //     BufferedReader buffer = new BufferedReader(reader);
        //     Stream<String> contents = buffer.lines();
        //     contents.forEach(System.out::println);
        //     buffer.close();
        // }catch(FileNotFoundException e)
        // {
        //     System.out.println("The file was not found");
        // }catch(IOException e)
        // {
        //     System.out.println("An IO Exception occurred");
        // }
        //option2 let the method rethrow the exception
        FileReader reader = new FileReader(filename);
        BufferedReader buffer = new BufferedReader(reader);
        Stream<String> contents = buffer.lines();
        contents.forEach(System.out::println);
        buffer.close();
        
   

        
        
    }
}