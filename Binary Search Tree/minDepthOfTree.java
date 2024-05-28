public class minDepthOfTree 
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
    int minDepth(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null) // this means the root node is a leaf node
        {
            return 1;
        }
        if(root.left==null)
        {
            return minDepth(root.right)+1;
        }
        if(root.right==null)
        {
            return minDepth(root.left)+1;
        }
        int leftH=minDepth(root.left);
        int rightH=minDepth(root.right);
        return Math.min(leftH,rightH)+1;

    }
    
}
