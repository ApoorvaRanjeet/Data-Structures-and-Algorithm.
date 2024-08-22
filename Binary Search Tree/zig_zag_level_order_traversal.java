import java.util.*;
public class zig_zag_level_order_traversal 
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
    public List<List<Integer>> zigzag(Node root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        boolean leftToright = true;
        while(!q.isEmpty())
        {
            int size=q.size();
            LinkedList<Integer> row= new LinkedList<>();
            for(int i=0; i<size; i++)
            {
                Node node= q.poll();
                if(leftToright)
                {
                    row.add(node.value);
                }
                else
                {
                    row.addFirst(node.value);
                }
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            leftToright=!leftToright;
            result.add(row);
        }
        return result;
    }
}
