package mcf;
/**
 * A node class to represent the abstract data type
 * of a node.
 */

public class Node<E> 
{
    private E value;
    private Node<E> next;

    public Node(E value)
    {
        this(value, null);
    }

    public Node(E value, Node<E> next)
    {
        this.value = value;
        this.next = next;
    }

    public void setValue(E value)
    {
        this.value = value;
    }
    public E getValue()
    {
        return this.value;
    }

    public void setNext(Node<E> next)
    {
        this.next = next;
    }

    public Node<E> getNext()
    {
        return this.next;
    }

    @Override 
    public String toString()
    {
        if(this.next == null)
            return this.value + "->" + "null";

        return this.value + "->" + this.next.toString();
    }

}
