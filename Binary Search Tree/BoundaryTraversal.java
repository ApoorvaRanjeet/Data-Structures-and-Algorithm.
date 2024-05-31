import java.util.ArrayList;
public class BoundaryTraversal 
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

    public boolean isLeaf(Node root)
    {
        return (root.left==null && root.right==null);
    }

    void addleftBoundary(Node root,ArrayList<Integer> res)
    {
        Node curr=root.left;
        while(curr!=null)
        {
            if(!isLeaf(curr))
            {
                res.add(curr.value);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    void addRightBoundary(Node root,ArrayList<Integer> res)
    {
        Node curr=root.right;
        ArrayList<Integer> temp= new ArrayList<>();
        while(curr!=null)
        {
            if(!isLeaf(curr))
            {
                temp.add(curr.value);
            }
            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
            for(int i=temp.size()-1;i>=0;i--)
            {
                res.add(temp.get(i));
            }
        }
    }
    void addLeaves(Node root,ArrayList<Integer> res)
    {
        if(isLeaf(root))
        {
            res.add(root.value);
        }
        if(root.left!=null) addLeaves(root.left, res);
        if(root.right!=null) addLeaves(root.right, res);
    }
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }
        if (!isLeaf(node)) {
            ans.add(node.value);
        }
        addleftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }
}
