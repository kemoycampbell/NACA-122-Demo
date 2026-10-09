package binary_tree;

public class BinaryNode 
{
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue()
    {
        return this.value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public BinaryNode getLeft()
    {
        return this.left;
    }

    public void setLeft(BinaryNode left)
    {
        this.left = left;
    }


    public BinaryNode getRight()
    {
        return this.right;
    }

    public void setRight(BinaryNode right)
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




}
