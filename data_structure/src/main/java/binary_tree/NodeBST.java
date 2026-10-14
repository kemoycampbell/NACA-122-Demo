package binary_tree;

public class NodeBST implements BinarySearchTree
{
    private BinaryNode root;
    private int size;

    public NodeBST()
    {
        this.root = null;
        this.size = 0;
    }

    @Override
    public void insert(int value) {
        //increment the size
        size++;
        BinaryNode node = new BinaryNode(value);

        //if the root is empty, we dont need to do anything
        if(root == null){
            this.root = node;
            return;
        }

        //recursively find the right subtree to insert at
        binaryInsert(root, node);
    }

    private void binaryInsert(BinaryNode node, BinaryNode nodeToInsert)
    {
        int value = nodeToInsert.getValue();
        if(value < node.getValue()){
            BinaryNode left = node.getLeft();
            if(left == null) {
                node.setLeft(nodeToInsert);
                return;
            }
            //go to the next left node recursively
            binaryInsert(left, nodeToInsert);  
        } else{
            BinaryNode right = node.getRight();
            if(right == null)
            {
                node.setRight(nodeToInsert);
                return;
            }

            binaryInsert(right, nodeToInsert);
        }
    }

    @Override
    public boolean search(int target) {
        return binarySearch(root, target);
    }

    private boolean binarySearch(BinaryNode node, int target)
    {
        //the node value match the target
        int currentValue = node.getValue();
        if(target == currentValue){
            return true;
        }

        //the value is smaller we search the left recursively
        BinaryNode nextNode = null;
        if(target < currentValue){
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
