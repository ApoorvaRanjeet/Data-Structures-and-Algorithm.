import java.util.*;
public class modes_in_BST 
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
    public int[] modes(Node root)
    {
        Map<Integer,Integer> map= new HashMap<>();
        inorder(root,map);
        int maxFrequency=0;
        for(int fre:map.values())
        {
            maxFrequency=Math.max(maxFrequency,fre);
        }
        List<Integer> modes= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==maxFrequency)
            {
                modes.add(entry.getKey());
            }
        }
        int[] result= new int[modes.size()];
        for(int i=0;i<modes.size();i++)
        {
            result[i]=modes.get(i);
        }
        return result;
    }
    private void inorder(Node root,Map<Integer,Integer>map)
    {
        if(root==null)
        {
            return;
        }
        inorder(root,map);
        map.put(root.value,map.getOrDefault(root.value,0)+1);
        inorder(root.right,map);
    }
}
