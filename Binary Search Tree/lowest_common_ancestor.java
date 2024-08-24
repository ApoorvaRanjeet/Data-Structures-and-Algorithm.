public class lowest_common_ancestor 
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
    public Node lowestCommonAncestor(Node root,Node p,Node q)
    {
        if(root==null || root==p||root==q)
        {
            return root;
        }
        Node left=lowestCommonAncestor(root.left, p, q);
        Node right=lowestCommonAncestor(root.right, p, q);
        if(left==null)
        {
            return right;
        }
        else if(right==null)
        {
            return left;
        }
        else
        {
            return root;
        }
    }
}
