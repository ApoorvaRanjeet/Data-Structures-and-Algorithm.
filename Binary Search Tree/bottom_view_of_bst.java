import java.util.*;
public class bottom_view_of_bst 
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
    public List<Integer> bottomview(Node root)
    {
        List<Integer> ans= new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Map<Pair<Integer,Integer>> mpp= new TreeMap<>();
        Queue<Pair<Node,Integer>> q= new LinkedList<>();
        q.add(new Pair<>(root,0));
        while(!q.isEmpty())
        {
            Pair<Node,Integer> p= q.poll();
            Node node= p.getValue();
            int line=p.getKey();

            mpp.add(line,node.value);
            if(node.left!=null)
            {
                q.add(new Pair<>(node.left,line-1));
            }
            if(node.right!=null)
            {
                q.add(new Pair<>(node,right,line+1));
            }
        }
        for(int value:mpp.values())
        {
            ans.add(value);
            return ans;
        }
    }
}
