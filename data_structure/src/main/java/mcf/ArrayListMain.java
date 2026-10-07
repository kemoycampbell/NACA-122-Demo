package mcf;

public class ArrayListMain 
{
    public static void main(String args[])
    {
        int[] testData = {
            2,3,4
        };

        List<Integer> list = new ArrayList<Integer>();

        //add each of our test data
        for (int data : testData) {
            list.append(data); 
        }

        System.out.println(list);
    }
}
