import java.util.*;
public class avg_of_levels_in_binarytree 
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
    public List<Double> avg(Node root)
    {
        List<Double> averages= new ArrayList<>();
        if(root==null)
        {
            return averages;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            double sum=0.0;
            for(int i=0;i<size;i++)
            {
                Node curr= q.poll();
                sum+=curr.value;
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
            double avg=sum/size;
            averages.add(avg);
        }
        return averages;
    }
}
