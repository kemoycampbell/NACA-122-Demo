package summation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Summer {
    
    /**
     * Write your caclulateSum method here.  It must accept a single parameter and work with
     * either a fileParser or StringParser object passed in from main.  It should return an
     * integer that is the sum of integers returned from getInts method.
     */
    
    public static void main(String[] args) {
        // FileParser fileParser = new FileParser("data.txt");
        // int fileSum = calculateSum(fileParser);
        // System.out.println("File Parser sum = " + fileSum);

        StringParser stringParser = new StringParser("1,2,3,4");
        int stringSum = calculateSum(stringParser);
        System.out.println("String Parser sum = " + stringSum);
    }



}
