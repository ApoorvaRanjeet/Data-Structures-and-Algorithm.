

public class Target_copy {
    static Node root;

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
    public final Node getTargetCopy(final Node original, final Node cloned, final Node target) {
        if (original == null) {
            return null;
        }
        
        // If the current node in the original tree matches the target, return the cloned node
        if (original == target) {
            return cloned;
        }
        
        // Traverse the left subtree
        Node leftResult = getTargetCopy(original.left, cloned.left, target);
        if (leftResult != null) {
            return leftResult;
        }
        
        // Traverse the right subtree
        return getTargetCopy(original.right, cloned.right, target);
    }
}
