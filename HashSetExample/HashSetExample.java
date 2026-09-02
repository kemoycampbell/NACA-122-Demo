
import java.util.HashSet;
void main()
{
    //hashset doesnt guarantee orders
    //set ensure that it is unique
    Set<String> hashset = new HashSet<>();

    hashset.add("x");
    hashset.add("y");
    hashset.add("z");

    //show what is inside the hashset
    //we can use a foreach... the syntax is different from C# 

    /*
    in C# we do something like
    foreach (string item in hashset)
    {
        Console.WriteLine(item);
    }
     */

    //java for each is as follow
    for(String item: hashset){
        System.out.println(item);
    }
}