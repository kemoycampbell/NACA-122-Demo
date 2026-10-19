package heaps;

public class Main 
{
    public static void main(String args[])
    {
        Heap heap = new ArrayHeap();
        System.out.println(heap);

        int[] testValue = {
            5,4,3,1,6
        };

        for(int value: testValue){
            heap.add(value);
        }

        System.out.println(heap);

        System.out.println("Removed:" + heap.remove());
        System.out.println(heap);
    }
}
