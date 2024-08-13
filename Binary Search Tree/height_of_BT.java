public class height_of_BT 
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
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lefth=height(root.left);
        int righth=height(root.right);
        return 1+Math.max(lefth,righth);
    }
    
}
