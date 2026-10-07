package mcf;

public interface List<E> 
{
    public void append(E value);
    public E get(int index);
    public void set(int index, E value);
    public int size();
}
