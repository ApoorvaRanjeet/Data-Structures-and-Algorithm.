import java.util.*;
public class flatten_bst_to_ll {
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
    static Node prev=null;
    //brute force approach
    public void flatten(Node root)
    {
        if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
    // better approach
    public void flatten1(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node> st= new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node curr=st.pop();
            if(curr.right!=null)
            {
                st.push(curr.right);
            }
            if(curr.left!=null)
            {
                st.push(curr.left);
            }
            if(!st.isEmpty())
            {
                curr.right=st.peek();
            }
            curr.left=null;
        }
    }

}
