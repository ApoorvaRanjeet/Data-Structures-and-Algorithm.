import java.util.*;
public class min_absolute_diff 
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
    public int getMinimumDifference(Node root)
    {
        ArrayList<Integer> result= new ArrayList<>();
        helper(root,result);
        int maxDiff= Integer.MAX_VALUE;
        for(int i=1;i<result.size();i++)
        {
            int diff= result.get(i)-result.get(i-1);
            if(diff<maxDiff)
            {
                maxDiff=diff;
            }
        }

        return maxDiff;
    }
    private void helper(Node root,ArrayList<Integer> result)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,result);
        result.add(root.value);
        helper(root.right,result);
    }
    
}
