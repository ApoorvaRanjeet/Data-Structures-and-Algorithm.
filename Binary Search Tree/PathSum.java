public class PathSum 
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
    public boolean hasPathSum(Node root,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            return targetSum==root.value;
        }
        int remainingSum=targetSum-root.value;
        return hasPathSum(root.left,remainingSum) || hasPathSum(root.right,remainingSum);
    }
    
}
