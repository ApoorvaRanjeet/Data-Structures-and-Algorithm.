public class isSymmetricTree 
{
    static Node root;
    static class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value=value;
        }
    }
    public boolean isSymmetric(Node root)
    {
        return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(Node p,Node q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null || q==null)
        {
            return false;
        }
        if(p.value!=q.value)
        {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }

    }
    

