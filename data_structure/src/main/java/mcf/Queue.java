package mcf;
/**
 * An interface that represent Queue which
 * use the FIFO data structure
 * Queue
 */

public interface Queue<E> 
{

    /**
     * Add an element to the back of the queue
     * @param value - the element to add to the back of the queue
     */
    public void enqueue(E value);

    /**
     * Remove an element from the front of the queue
     * @return the element removed from the queue
     */
    public E dequeue();

    /**
     * returns the size of the queue
     * @return
     */
    public int size();
    

}
