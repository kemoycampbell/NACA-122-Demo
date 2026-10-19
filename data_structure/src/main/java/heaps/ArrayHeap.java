package heaps;

import java.util.Arrays;

public class ArrayHeap<E extends Comparable<E>> implements Heap<E>
{
    private int size;
    private Object[] array;
    private final static int INITIAL_CAPACITY = 3;

    public ArrayHeap()
    { this(INITIAL_CAPACITY);
    }

    public ArrayHeap(int capacity)
    {
        this.size = 0;
        this.array = new Object[capacity];
    }

    @Override
    public void add(E value) {
        //grow if we are at capacity
        if(this.size == array.length){
            //double the size
            int newSize = this.size * 2;
            this.array = Arrays.copyOf(this.array, newSize);
        }

        //put the elmeent at the leftmost-open position
        //when doing in array, this is basically the open position
        this.array[this.size] = value;

        //sifting up algorithm
        int child = size;
        int parent = (child-1) / 2;

        while(((E)this.array[parent]).compareTo((E)array[child]) > 0)
        {
            swap(child, parent);
            child = parent;
            parent = (child - 1) / 2;
        }

        this.size++;
    }

    private void swap(int a, int b)
    {
        if(this.array[a]!=this.array[b]){
            E temp = (E)this.array[a];
            this.array[a] = this.array[b];
            this.array[b] = temp;
        }
    }

    @Override
    public E remove() {

        //temp save the top
        E removed = (E)this.array[0];
        this.size--;

        //set the last right most as the new top
        this.array[0] = this.array[this.size];
        //we already move the to the front so mark it as 0 to indicate moved
        this.array[size] = 0;

        int parent = 0;
        while(parent < size){
            int left = 2*parent + 1;
            int right = 2*parent + 2;
            int smallest = parent;

            //is the left the smallest?
            if(left < size && ((E)this.array[left]).compareTo((E)this.array[parent]) < 0)
            {
                smallest = left;
            } 
            
            if(right < size && ((E)this.array[right]).compareTo((E)this.array[smallest]) < 0)
            {
               smallest = right;
            } 

            //if the priority is already correct, do nothing
            if(smallest == parent)
                break;

            swap(smallest, parent);
            parent = smallest;

        }



        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString()
    {
        return size +"," + Arrays.toString(array);
    }

}
