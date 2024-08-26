import java.util.*;
public class deserialize_binary_tree 
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
    public Node deserialize(String data)
    {
        if(data.equals(""))
        {
            return null;
        }
        Queue<Node> q= new LinkedList<>();
        String[] values= data.split(",");
        Node root= new Node(Integer.parseInt(values[0]));
        q.add(root);
        while(!q.isEmpty())
        {
            for(int i=1;i<values.length;i++)
            {
                Node curr=q.poll();
                if(!values[i].equals("#"))
                {
                    Node left= new Node(Integer.parseInt(values[i]));
                    curr.left= left;
                    q.add(left);
                }
                if(++i<values.length && !values[i].equals("#"))
                {
                    Node right= new Node(Integer.parseInt(values[i]));
                    curr.right=right;
                    q.add(right);
                }
            }
        }
        return root;
    }
}
