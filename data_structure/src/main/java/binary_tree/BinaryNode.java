package binary_tree;

public class BinaryNode<E> 
{
    private E value;
    private BinaryNode<E> left;
    private BinaryNode<E> right;

    public BinaryNode(E value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public E getValue()
    {
        return this.value;
    }

    public void setValue(E value)
    {
        this.value = value;
    }

    public BinaryNode<E> getLeft()
    {
        return this.left;
    }

    public void setLeft(BinaryNode<E> left)
    {
        this.left = left;
    }


    public BinaryNode<E> getRight()
    {
        return this.right;
    }

    public void setRight(BinaryNode<E> right)
    {
        this.right = right;
    }

    @Override
    public String toString()
    {
        String res = "BinaryNode{value="+ this.value;
        //BinaryNode{value=<value>, left=<left>, right=<right>}"
        
        //left sub tree
        res = res + ", left=" + (left!=null? left.toString() : "null");
        //right subtree
        res = res + ", right="+ (right!=null ? right.toString() : "null");
        

        return res + "}";
    }

    public String infixTraversal()
    {
        String traverse = "";

        //visit the lefts
        if(this.left!=null){
            traverse+=left.infixTraversal();

        }

        //middle
        traverse+=this.value + " ";

        //right
        if(this.right!=null){
            traverse+=right.infixTraversal();
        }

        return traverse;
    }

    public boolean search(E target)
    {
        //search the middle
        if(this.value.equals(target))
            return true;

        boolean found = false;

        if(this.left!=null){
            found = left.search(target);
        }

        if(!found && this.right!=null)
            found = right.search(target);

        return found;
    }





}
