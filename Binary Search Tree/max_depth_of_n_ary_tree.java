import java.util.List;
import java.util.Queue;
import java.util.*;
public class max_depth_of_n_ary_tree 
{
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public int maxDepth(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int depth=0;
    Queue<Node > q= new LinkedList<>();
    while(!q.isEmpty())
    {
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            Node curr=q.poll();
            for(Node child:curr.children)
            {
                if(child!=null)
                {
                    q.add(child);
                }
            }
        }
        depth++;
    }
return depth;
}
    
}
