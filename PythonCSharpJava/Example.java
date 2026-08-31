import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
/**
 * The main method is the entry point of a program
 */
void main()
{
    int[] numbers = new int[10];
    numbers[0] = 55;
    numbers[9] = 100000;

    for(int i = 0; i < numbers.length; i++)
    {
        System.out.println(numbers[i]);
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string:");
    String userEnteredString = scanner.nextLine();
    scanner.close();

    String reverse = reverseChars(userEnteredString);
    System.out.println("Reverse = " + reverse);
    // System.out.println("Hello world");
    // int age = 10;

    // String name = "Kemoy";
    // long aLongType = 100l;

    // /**
    //  * int to long
    //     long >3 Billion to int
    //     char to int
    //     int in the range 33 ≤ i ≤ 126 to char
    //     boolean to int

    //  */

    // int num = 5;
    // int numToLong = num;

    // long threeBillions = Integer.MAX_VALUE + 1;
    // int billionsToInt = (int)threeBillions;

    // char a = 'a';
    // int charToInt = (int)a;
    // int charInt = 33;
    // char exclamination = (char)charInt;
    // boolean isHungry=true;

    // int intBool = Boolean.compare(isHungry, false);

    // //Accept numbers from the user
    // //first set up the scanner
    // //we are telling the scanner that we are reading from
    // //the keyboard(system.in)
    // Scanner scanner = new Scanner(System.in);

    // // //Ask the user for the first number
    // // System.out.print("Enter the first number:");
    // // int num1 = scanner.nextInt();
    // // System.out.print("Enter the second number:");
    // // int num2 = scanner.nextInt();

    // // int sum = add(num1, num2);

    // // String result = String.format("%d + %d = %d", num1, num2, sum);

    // // System.out.println(result);

    // // //close the scanner when you are done
    // // scanner.close();

    // // ArrayList<String> list = new ArrayList<String>();

    // // list.add("Kemoy");
    // // // list.add(5);
    // // // list.add(5.0);

    // // double res = Math.pow(num2, sum);
    // // System.out.println(res);

    // System.out.print("Enter n:");
    // int n = scanner.nextInt();

    // int sum = countFor(n);
    // System.out.println("Result=" + sum);


    // System.out.println(String.format("Nathaniel's raise--> dispatcherd raise result [30^2]: %d", raise_nathaniel(30,)));
    

    // // System.out.println("Hello " + name + " . You are " + age);
    // // System.out.println(("First letter: " + name.charAt(0)));
    // // System.out.println("The sum of 2 and 4 is " + sum);

    // evenlyDivisible_nathaniel(20); 

}

/**
 * Add both numbers
 * @param num1 - The first number
 * @param num2 - The second number
 * @return The sum of the first and the second number
 */
int add(int num1, int num2)
{
    return num1 + num2;
}

int countFor(int n)
{
    int sum = 0;

    for(int i = 0; i <=n; i++){
        System.out.println(i);
        sum+=i;
    }

    return sum;
}

float raise(float base, int exponent)
{
    float result = 1;

    for(int i = 0; i < exponent; i++)
    {
        result = result * base;
    }
    
    return result;
}

float raise_nathaniel(float base, int exponent) {
    float accumulation = 1; 

    for(int x = 0; x < exponent; x++) {
        accumulation = accumulation * x;
    }
    return accumulation; 
} 

void evenlyDivisible(int n)
{
    if (n % 2 == 0)
    {
        System.out.println("The number is even");
    }
    else if (n % 3 == 0)
    {
        System.out.println("The number is divisible by 3");
    }
    else if (n % 5 == 0)
    {
        System.out.println("The number is divisible by 5");
    }
    else
    {
        System.out.println("The number is odd but not divisible by 3 or 5");
    }
}



void evenlyDivisible_nathaniel(int n) {
    if (n % 2 == 0) {
        System.out.println(String.format("The %d int is even...", n));
    } 

    else if (n % 3 == 0) {
        System.out.println(String.format("The %d int is divisible by 3...", n));
    }

    else if (n % 5 == 0) {
        System.out.println(String.format("The %d int is divisible by 5...", n));
    }

    else {
        System.out.println(String.format("The %d int is odd but not divisible either by 3 or 5...", n));
    }
}

String reverseChars(String inputString)
{
    //create a empty string to hold the reverse string
    String reverseString = "";

    //get the total string length
    //we subtract 1 because we need zero based index
    int length = inputString.length() - 1;

    //start from the back
    for(int index = length; index >=0; index-- ){
        //add the back string to the reverse string
        reverseString = reverseString + inputString.charAt(index);
    }

    return reverseString;
}