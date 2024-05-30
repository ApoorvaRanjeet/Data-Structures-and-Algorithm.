public class diameteroftree 
{
    class Node {
        int value;
        Node left, right;
    
        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int diam1= diameter(root.left);
        int diam2= diameter(root.right);
        int diam3= height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    static class TreeInfo
    {
        int ht;
        int diam;
        TreeInfo(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0, 0);
        }
        TreeInfo left= diameter2(root.left);
        TreeInfo right= diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;
        int diam1 =left.diam;
        int diam2= right.diam;
        int diam3= left.ht+right.ht+1;
        int mydiam= Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myinfo= new TreeInfo(myHeight, mydiam);
        return myinfo;

    }
    private static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int h1= height(root.left);
        int h2= height(root.right);
        return Math.max(h1,h2)+1;
    }
    
}
