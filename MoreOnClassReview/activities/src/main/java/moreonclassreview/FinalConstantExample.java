package moreonclassreview;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
/***
 * 
 * The lesson here:
 * 
 * The answer to life is use constant to represent numbers to 
 * reduce complexity and make it easy to read the codebases
 * 
 * Less brain work = more power, happy developer and you get to keep
 * ...... all your hairs
 */
public class FinalConstantExample 
{
    private final static int ANSWER_TO_LIFE = 42;

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        if(number < ANSWER_TO_LIFE)
        {
            System.out.println("Well, this is not even the answer to life");
        } else if(number > ANSWER_TO_LIFE){
            System.out.println("This might be the answer to life.... and more!");
        } else {
            System.out.println("This is EXACTLY the answer to life");
        }
    }

}
