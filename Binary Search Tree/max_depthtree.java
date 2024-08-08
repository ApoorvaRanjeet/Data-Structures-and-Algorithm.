public class max_depthtree 
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
    public int maxDepth(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return 1;
        }
        if(root.left==null)
        {
            return maxDepth(root.right)+1;
        }
        if(root.right==null)
        {
            return maxDepth(root.left)+1;
        }
        int leftH=maxDepth(root.left);
        int rightH=maxDepth(root.right);
        return Math.max(leftH,rightH)+1;
    }
    
}
