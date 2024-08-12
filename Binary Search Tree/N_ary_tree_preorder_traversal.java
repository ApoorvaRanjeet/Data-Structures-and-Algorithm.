import java.util.*;
public class N_ary_tree_preorder_traversal 
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
    public List<Integer> preorder(Node root)
    {
        List<Integer> result= new ArrayList<>();
        preorderHelper(root,result);
        return result;
    }
    private void preorderHelper(Node root,List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
        result.add(root.val);
        for(Node child:root.children)
        {
            preorderHelper(child, result);
        }
    }
}
