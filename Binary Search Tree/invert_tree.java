public class invert_tree 
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
    public Node inverTree(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        inverTree(root.left);
        inverTree(root.right);
        return root;
    }
    
}
