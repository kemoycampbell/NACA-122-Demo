package files;

import java.io.File;

public class JavaFiles 
{
    public static void main(String args[])
    {
        String path = "data/grades_010.csv";
        File file = new File(path);

        System.out.println(file.exists());
    }
    
}
