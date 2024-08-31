import java.util.*;
public class level_order_traversal_II {
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
    public List<List<Integer>> level(Node root)
    {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> row= new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                row.add(curr.value);
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
            result.add(0,row); // this is method to revrese ,humlog Collections.reverse but in this case it would not require extra space and extra reverse operation
        }
return result;
    }
}
