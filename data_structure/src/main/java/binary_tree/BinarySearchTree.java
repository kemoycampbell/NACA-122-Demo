package binary_tree;

public interface BinarySearchTree<E> 
{
    public void insert(E value);
    public boolean search(E target);
    public int size();
}
