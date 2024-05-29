import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leftviewtree 
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
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                
                if (i == size - 1) {
                    result.add(current.value);
                }
                
               
                if (current.right != null) {
                    queue.add(current.right);
                }
               
                 if (current.left != null) {
                    queue.add(current.left);
                }
            }
        }
        
        return result;
    }

    
}
