package mcf;

import java.util.Iterator;

public class NodeQueueIterator<E> implements Iterator<E>
{
    private Node<E> front;

    public NodeQueueIterator(Node<E> front)
    {
        this.front = front;
    }

    @Override
    public boolean hasNext() {
       //if the front is null then there is nothing more to process
       if(this.front == null)
        return false;
       
       //is there a next attach to the front?
       if(this.front.getNext()== null)
            return false;

       //otherwise we have more stuff to process
       return true;
    }

    @Override
    public E next() {
        //get the current data
        E data = this.front.getValue();
        
        //move the front
        this.front = this.front.getNext();
        return data;
    }

}
