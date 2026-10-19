package heaps;

public interface Heap<E>
{
    public void add(E value);
    public E remove();
    public int size();
    
}
