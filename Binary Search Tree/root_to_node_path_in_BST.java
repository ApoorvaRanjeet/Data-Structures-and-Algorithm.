import java.util.*;

public class root_to_node_path_in_BST {
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
    public ArrayList<ArrayList<Integer>> path(Node root)
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr= new ArrayList<>();
        helper(root,ans,curr);
        return ans;
    }
    private void helper(Node root,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr)
    {
        if(root==null)
        {
            return;
        }

        curr.add(root.value);

        if(root.left==null && root.right==null)
        {
            ans.add(new ArrayList<>(curr));
        }
        else
        {
            helper(root.left,ans,curr);
            helper(root.right,ans,curr);
        }
        curr.remove(curr.size()-1);
    }
}
