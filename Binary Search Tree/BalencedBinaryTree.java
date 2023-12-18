class BalancedBinaryTree 
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

    public static int height(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right) +1;
    }
    public static  boolean isBalanced(Node root) 
    {
        if(root==null)
        {
            return true;
        }
        int left = height(root.left);
        int right= height(root.right);
        if(Math.abs(left-right)>1)
        {
            return false;
        } 
        return isBalanced(root.left)  && isBalanced(root.right);
        
    }

    public static void main(String[] args)
    {
        // Constructing a sample tree
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Check if the tree is balanced
        boolean result = isBalanced(root);
        System.out.println("Is the tree balanced? " + result);
    }
}
