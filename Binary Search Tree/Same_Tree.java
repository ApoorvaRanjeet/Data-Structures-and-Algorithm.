class Same_Tree 
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

    public static Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        }
        Node temp;
        if (root.value >= data)
        {
            temp = insert(root.left, data);
            root.left = temp;
        } else {
            temp = insert(root.right, data);
            root.right = temp;
        }
        return root;
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
