public class Sum_of_left_leaves 
{
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
    public int sumOfLeftLeaves(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum+=root.left.value;
        }
        sum+=sumOfLeftLeaves(root.left);
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
}
