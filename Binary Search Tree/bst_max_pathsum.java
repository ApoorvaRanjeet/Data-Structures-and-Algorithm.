public class bst_max_pathsum 
{
    static Node root;
    private int maxsum;
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
    public int maxPathSum(Node root)
    {
        maxGain(root);
        return maxsum;
    }
    private int maxGain(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftgain= Math.max(maxGain(root.left),0);
        int rightgain=Math.max(maxGain(root.right),0);

        int newpath= root.value+leftgain+rightgain;
        maxsum=Math.max(maxsum,newpath);
        return root.value+Math.max(leftgain,rightgain);
    }
}
