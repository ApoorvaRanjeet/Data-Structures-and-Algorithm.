// import javax.swing.tree.TreeNode;

public class root_equals_sum_of_children 
{
    static Node root;
    // private int maxsum;
    static class Node
    {
        int val;
        Node left;
        Node right;

        Node(int value)
        {
            this.val = value;
        }
    }
    public boolean checkTree(Node root) {
        // Calculate the sum of the values of the left and right children
        int sum = root.left.val + root.right.val;
        
        // Check if the root's value is equal to this sum
        return root.val == sum;
    }
    
}
