package graph;

import java.util.HashSet;
import java.util.Set;

public class Vertex<E> 
{
    private E value;
    private Set<Vertex<E>> neighbors;

    public Vertex(E value)
    {
        this.value = value;
        this.neighbors = new HashSet<Vertex<E>>();
    }

    public E getValue()
    {
        return this.value;
    }

    public void Connect(Vertex<E> neighbor)
    {
        this.neighbors.add(neighbor);
    }

    public boolean connected(Vertex<E> neighbor)
    {
        return this.neighbors.contains(neighbor);
    }

    public Set<Vertex<E>> getNeighbors()
    {
        return this.neighbors;
    }

}
