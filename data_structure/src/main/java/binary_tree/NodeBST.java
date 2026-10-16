package binary_tree;

public class NodeBST<E extends Comparable<E>> implements BinarySearchTree<E>
{
    private BinaryNode<E> root;
    private int size;

    public NodeBST()
    {
        this.root = null;
        this.size = 0;
    }

    @Override
    public void insert(E value) {
        //increment the size
        size++;
        BinaryNode<E> node = new BinaryNode<E>(value);

        //if the root is empty, we dont need to do anything
        if(root == null){
            this.root = node;
            return;
        }

        //recursively find the right subtree to insert at
        binaryInsert(root, node);
    }

    private void binaryInsert(BinaryNode<E> node, BinaryNode<E> nodeToInsert)
    {
        E value = nodeToInsert.getValue();

        if(value.compareTo(node.getValue()) < 0){
            BinaryNode<E> left = node.getLeft();
            if(left == null) {
                node.setLeft(nodeToInsert);
                return;
            }
            //go to the next left node recursively
            binaryInsert(left, nodeToInsert);  
        } else{
            BinaryNode<E> right = node.getRight();
            if(right == null)
            {
                node.setRight(nodeToInsert);
                return;
            }

            binaryInsert(right, nodeToInsert);
        }
    }

    @Override
    public boolean search(E target) {
        return binarySearch(root, target);
    }

    private boolean binarySearch(BinaryNode<E> node, E target)
    {
        //the node value match the target
        E currentValue = node.getValue();
        if(target.compareTo(currentValue) == 0){
            return true;
        }

        //the value is smaller we search the left recursively
        BinaryNode<E> nextNode = null;
        if(target.compareTo(currentValue) < 0){
            nextNode = node.getLeft();
        } else{
            nextNode = node.getRight();
        }

        if(nextNode == null)
            return false;

        return binarySearch(nextNode, target);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString()
    {
        return root.infixTraversal();
    }
    
}
