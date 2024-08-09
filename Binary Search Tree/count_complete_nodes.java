public class count_complete_nodes 
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
    public int countSum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+countSum(root.left)+countSum(root.right);
    }
    
}
