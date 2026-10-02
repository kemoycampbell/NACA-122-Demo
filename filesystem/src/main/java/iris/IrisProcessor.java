package iris;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IrisProcessor 
{
    public static void main(String args[])
    {
        Iris iris = new Iris("1.4,0.2,Setosa");
        System.out.println(iris);

        Iris[] flowers = readData("data/iris.csv");
        System.out.println("Length:" + flowers.length);
    }

    public static Iris[] readData(String filename)
    {
        try{

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            Iris[] irises = reader.lines().map(line-> new Iris(line)).toArray(Iris[]::new);
            reader.close();
            return irises;

        }catch(FileNotFoundException e)
        {
            System.out.println("Cannot find the filename:"+filename);
        }catch(IOException e)
        {
            System.out.println("An error occurred when reading from the file!");
        }

        return null;


    }

}
