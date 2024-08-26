import java.util.*;
public class Serial_binary_tree {
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
    public String serialize(Node root)
    {
        if(root==null)
        {
            return ""; 
        }
        StringBuilder sb= new StringBuilder();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            if(curr==null)
            {
                sb.append("#,");
            }
            else
            {
                sb.append(curr.value).append(",");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();
    }
}
