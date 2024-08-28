import java.util.*;
public class BT_from_inorder_preorder 
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
    public Node inorderpreorder(int[] inorder,int[] preorder)
    {
        Map<Integer,Integer> map= new HashMap<>();
        Node root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    private Node buildTree(int[]preorder,int prestart,int preend,int[]inorder,int instart,int inend,Map<Integer,Integer>map)
    {
        if(prestart>preend || instart>inend)
        {
            return null;
        }
        Node root=new Node(preorder[prestart]);
        int inRoot=map.get(root.value);
        int numsleft=inRoot-instart;
        root.left=buildTree(preorder,prestart+1,prestart+numsleft,inorder,instart,inRoot-1,map);
        root.right=buildTree(preorder,prestart+numsleft+1,preend,inorder,inRoot+1,inend,map);
        return root;
    }
}
