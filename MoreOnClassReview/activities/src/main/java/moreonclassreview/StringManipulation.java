package moreonclassreview;

import java.util.Scanner;

/**
 * This is just a class to demonstrate what
 * we can do with strings... we will become a....
 * magican
 * StringManipulation
 */
public class StringManipulation 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        

        System.out.println("The length of name before trim: " + name.length());
        
        //trim out the white space
        name = name.trim();
        System.out.println("The length of name after trim: " + name.length());

        System.out.print("What are your favorite animals:(separate with spaces)");

        String[] animals = scanner.nextLine().split(" ");

        System.out.println("You have "+ animals.length+ " favorite animal(s)");
        scanner.close();



    }
    
}
