public class SubTree_of_Another_Tree 
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
    public boolean isSubTree(Node root,Node subRoot)
    {
        if(root==null)
        {
            return false;
        }
        if(isSameTree(root,subRoot))
        {
            return true;
        }
        return isSubTree(root.left,subRoot)||isSubTree(root.right,subRoot);
    }
    private boolean isSameTree(Node s,Node t)
    {
        if(s==null && t==null)
        {
            return true;
        }
        if(s==null || t==null)
        {
            return false;
        }
        if(s.value==t.value)
        {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }
        return false;
    }
}
