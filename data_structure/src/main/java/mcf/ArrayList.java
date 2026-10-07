package mcf;

import java.util.Arrays;

public class ArrayList<E> implements List<E> 
{
    private Object[] elements;
    private int size;
    private static final int INITAL_CAPACITY = 2;

    public ArrayList()
    {
        this.elements = new Object[INITAL_CAPACITY];
    }

    @Override
    public void append(E value) {

        //check if we are about to full and resize
        if(this.size == this.elements.length){
            int doubleSize = this.elements.length * 2;

            //copy the elements from the original into the new array
            this.elements = Arrays.copyOf(this.elements, doubleSize);
        }
        this.elements[this.size] = value;
        this.size++;
    }

    @Override
    public E get(int index) {
        //cast back to E from Object type
        E element = (E)this.elements[index];
        return element;
    }

    @Override
    public void set(int index, E value) {
        this.elements[index] = value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override 
    public String toString()
    {
        return String.format("%d,%s", this.size, Arrays.toString(elements));
    }

}
