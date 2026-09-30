import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileExample {
    public static void main(String args[])
    {
        String path = "data/grades_010.csv";
        File file = new File(path);

        System.out.println(file.exists());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getAbsolutePath());

        readInFileWithScanner(path);
        System.out.println();
        readInFileWithBufferReader(path);
        readInFileWithBufferReaderLamda(path);
        
    }

    public static void readInFileWithScanner(String filename)
    {
        File file = new File(filename);
        try{
            Scanner scanner = new Scanner(file);
            
            int line = 1;
            //check if there is more object to process
            while(scanner.hasNext()) {
                System.out.println("Line:" + line);
                String currentLine = scanner.nextLine();
                System.out.println(currentLine);
                line++;
            }
            scanner.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("No file was found with the name "+ filename);
        }
    }

    public static void readInFileWithBufferReader(String filename)
    {
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(reader);
            int line = 1;
            String currentLine;

            while((currentLine = buffer.readLine())!=null)
            {
                System.out.println("Line:" + line);
                System.out.println(currentLine);
                line++;
            }
            buffer.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static void readInFileWithBufferReaderLamda(String filename)
    {
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(reader);

            Stream<String> filStream = buffer.lines();
            filStream.forEach(System.out::println);
            buffer.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}