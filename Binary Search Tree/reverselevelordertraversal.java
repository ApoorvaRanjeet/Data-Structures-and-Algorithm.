import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverselevelordertraversal 
{
    static Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.value) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }  
}
public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> result =  new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node current = q.remove();
            stack.push(current.value);
            if(current.right!=null)
            {
                q.add(current.right);
            }
            if(current.left!=null)
            {
                q.add(current.left);
            }
        }
        while(!stack.isEmpty())
        {
            result.add(stack.pop());
        }
        return result;
    }
    
}
