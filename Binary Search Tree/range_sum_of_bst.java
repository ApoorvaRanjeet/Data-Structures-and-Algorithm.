public class range_sum_of_bst 
{
    static Node root;
    private int sum=0;
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
    public int rangeSumBST(Node root,int low,int high)
    {
        // my approach
        if(root==null)
        {
            return 0;
        }
        if(root.value>=low && root.value<=high)
        {
            sum+=root.value;
        }
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right,low,high);
        return sum;
    }
    public int rangeSBST(Node root,int low,int high)
    {
        //optimized approach like ignoring unnecessary branches
        if(root==null)
        {
            return 0;
        }
        if(root.value <low)
        {
            return rangeSBST(root.right, low, high); // we will skip left subtree if its nodes value is less than low
        }
        if(root.value> high)
        {
            return rangeSBST(root.left,low,high); //we will skip the right subtree if its nodes value is greater than high
        }
        return root.value+rangeSBST(root.left, low, high)+rangeSBST(root.right, low, high);
    }
}
