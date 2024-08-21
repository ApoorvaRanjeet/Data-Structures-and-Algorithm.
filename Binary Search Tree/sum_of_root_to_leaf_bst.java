public class sum_of_root_to_leaf_bst 
{
    static Node root;

    static class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value = value;
        }
    }
    public int sumofRootLeaf(Node root)
    {
        return helper(root,0);
    }
    private int helper(Node node,int currentsum)
    {
        if(node==null)
        {
            return 0;
        }
        currentsum=(currentsum<<1) | node.value;
        if(node.left==null && node.right==null)
        {
            return currentsum;
        }
        return helper(node.left,currentsum)+helper(node.right,currentsum);
    }
}
