public class BinarySearchtree 
{
    Node root;

    class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value=value;
        }
    }
    public boolean insert(int value)
    {
        Node newNode = new Node(value);
        if(root==null)
        {
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true)
        {
            if(newNode.value==temp.value)
            {
                return false;
            }
            if(newNode.value<temp.value)
            {
                if(temp.left==null)
                {
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }

        }

    }
    public boolean contains(int value)
    {
        if(root==null)
        {
            return false;
        }
        Node temp=root;
        while(temp!=null)
        {
            if(value<temp.value)
            {
                temp=temp.left;
            }
            else if(value>temp.value)
            {
                temp=temp.right;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
     public static void main(String[]args)
    {
        BinarySearchtree bst=new BinarySearchtree();
        // System.out.println(bst.root);
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        // bst.insert(27);
        System.out.println(bst.contains(18));
        System.out.println(bst.contains(11));
        // System.out.println(bst.root.left.right.value);
    }
}
