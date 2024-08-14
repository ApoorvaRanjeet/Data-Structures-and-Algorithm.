import java.util.*;
public class optimized_modes_in_BST 
{
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();
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
    public int[] modes(Node root)
    {
        inOrder(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }
    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (prev == null || root.value != prev) {
            count = 1;
        } else {
            count++;
        }

        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(root.value);
        } else if (count == maxCount) {
            modes.add(root.value);
        }

        prev = root.value;
        inOrder(root.right);
    }
}
