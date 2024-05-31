public class isBalanced 
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

    boolean isBalanced(Node root)
    {
        if (root == null) {
            return true;
        }
        
        int leftH = height(root.left);
        int rightH = height(root.right);
        
        if (Math.abs(leftH - rightH) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(Node root)
    {
        if (root == null) {
            return 0;
        }
        
        int leftH = height(root.left);
        int rightH = height(root.right);
        
        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        isBalanced tree = new isBalanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);

        if (tree.isBalanced(tree.root)) {
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }
}
