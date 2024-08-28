import java.util.*;
public class BT_from_inorder_postorder 
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
    public Node buildTree(int[] inorder,int[]postorder)
    {
        if(inorder.length!=postorder.length)
        {
            return null;
        }
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        Node root=buildTreePostIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        return root;
    }
    private Node buildTreePostIn(int[] inorder,int instart,int inend,int[]postorder,int poststart,int postend,Map<Integer,Integer> map)
    {
        if(poststart>postend ||instart>inend)
        {
            return null;
        }
        Node root=new Node(postorder[postend]);
        int inRoot=map.get(root.value);
        int numsLeft=inRoot-instart;
        root.left = buildTreePostIn(inorder, instart, inRoot - 1, 
        postorder, poststart, poststart + numsLeft - 1, map);
root.right = buildTreePostIn(inorder, inRoot + 1, inend, 
         postorder, poststart + numsLeft, postend - 1, map);
return root;
    }
}
