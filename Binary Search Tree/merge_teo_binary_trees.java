public class merge_teo_binary_trees 
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
    public Node merge(Node root1,Node root2)
    {
        if(root1==null)
        {
            return root2;
        }
        if(root2==null)
        {
            return root1;
        }
        Node curr= new Node(root1.value+root2.value);
        curr.left=merge(root1.left,root2.left);
        curr.right=merge(root1.right,root2.right);
        return curr;
        }
    
}
