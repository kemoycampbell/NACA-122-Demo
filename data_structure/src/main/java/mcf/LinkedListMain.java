package mcf;

public class LinkedListMain 
{
    public static void main(String args[])
    {
        int[] testData = {
            2,3,4
        };

        List<Integer> list = new LinkedList<Integer>();

        //add each of our test data
        for (int data : testData) {
            list.append(data); 
        }

        System.out.println(list);
    }
}
