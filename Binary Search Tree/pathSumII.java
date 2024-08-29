import java.util.*;

public class pathSumII 
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
    public List<List<Integer>> pathSum(Node root, int targetSum) 
    {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> row= new ArrayList<>();
        helper(root,targetSum,row,result);
        return result;
    }
    private void helper(Node root, int targetSum,List<Integer> row,List<List<Integer>> result)
    {
        if(root==null)
        {
            return;
        }
        row.add(root.value);
        if(root.left==null &&root.right==null && targetSum==root.value)
        {
            result.add(new ArrayList<>(row));
        }
        else{
            helper(root.left,targetSum-root.value,row,result);
            helper(root.right,targetSum-root.value,row,result);
        }
        row.remove(row.size()-1);
    }
}
