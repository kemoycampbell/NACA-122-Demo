package mcf;

import java.util.Iterator;

public class NodeQueue<E> implements Queue<E>, Iterable
{
    protected  Node<E> front;
    protected Node<E> back;
    private int size;

    public NodeQueue()
    {
        this.size = 0;
    }


    @Override
    public void enqueue(E value) 
    {
        Node<E> element = new Node<E>(value);
        size++;

        //when the node is empty
        //both front and back are the same
        if(this.front == null) {
            this.front = element;
            this.back = front;
            return;
        } 


        element.setNext(this.back.getNext());
        this.back.setNext(element);
        this.back = element;
        
  

    }

    @Override
    public E dequeue() {
        if(this.size == 0)
            return null;

        E element = this.front.getValue();

        //set the front to the next element in the line
        this.front = this.front.getNext();

        //if the front become empty, the back should also be empty
        if(this.front == null) {
            this.back = null;
        }

        this.size--;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override 
    public String toString()
    {
        if(this.front!=null)
            return this.front.toString();

        return "null";
    }


    @Override
    public Iterator iterator() {
        return new NodeQueueIterator<>(front);
    }

}
