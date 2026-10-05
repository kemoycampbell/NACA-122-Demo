package mcf;

public class ArrayQueue<E> implements Queue<E>
{
    private int front;
    private int back;
    private int size;
    private Object[] elements;
    private final static int INITAL_CAPACITY = 10;

    public ArrayQueue()
    {
        this(INITAL_CAPACITY);
        
        
    }

    public ArrayQueue(int capacity)
    {
        this.front = this.back = this.size = 0;
        this.elements = new Object[capacity];
    }

    @Override
    public void enqueue(E value) {
        this.grow();

        this.size++;
        this.elements[back] = value;
        this.back = ((this.back + 1) % this.elements.length);
    }

    private void grow()
    {
        if(this.size < this.elements.length)
            return;

        //double the size and copy the old elements into the new bucket
        Object[] copy = new Object[this.elements.length * 2];
        for(int i = 0; i < this.elements.length; i++){
            copy[i] = this.elements[i];
        }

        //set the old element to the new copy
        this.elements = copy;
    }

    @Override
    public E dequeue() {
        if(this.size == 0)
            return null;

        this.size--;
        E element = (E)this.elements[this.front];
        this.elements[this.front] = null; // set the previous front array location as null

        //taking wrap around into consideration
        this.front = ((this.front + 1) % this.elements.length);

        return element;

    }

    @Override
    public int size() {
        return this.size;
    }


    //fix for growth and circular
    @Override
    public String toString()
    {
        if(this.size == 0)
            return "null";

        String chain = "";
        for(Object element: elements){
            if(element == null)
                break;

            chain+=element + "->";
        }
        chain+="null";

        return chain;
    }

}
