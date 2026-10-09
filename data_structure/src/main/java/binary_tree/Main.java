package binary_tree;

public class Main 
{
    public static void main(String args[])
    {
        BinaryNode tree = new BinaryNode(2);
        BinaryNode left = new BinaryNode(3);
        BinaryNode right = new BinaryNode(7);
        right.setRight(new BinaryNode(6));

        //add to the tree
        tree.setLeft(left);
        tree.setRight(right);
        System.out.println(tree);
    }
}
