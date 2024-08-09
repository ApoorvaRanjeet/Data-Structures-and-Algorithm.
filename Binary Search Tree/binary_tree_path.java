import java.util.*;
public class binary_tree_path 
{
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
    public List<String> paths(Node root)
    {
        List<String> result = new ArrayList<>();
        if(root!=null)
        {
            helper(root,"",result);
        }
        return result;

    }
    private void helper(Node root,String s,List<String> result)
    {
        if(root!=null)
        {
            s+=Integer.toString(root.value);
            if(root.left==null && root.right==null)
            {
                result.add(s);
            }
            else
            {
                s+="->";
                helper(root.left,s,result);
                helper(root.right,s,result);
            }
        }
    }
}
