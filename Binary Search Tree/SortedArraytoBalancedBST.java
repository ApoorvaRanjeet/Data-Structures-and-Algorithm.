import javax.swing.tree.TreeNode;

public class SortedArraytoBalancedBST 
{
    Node root;

    class Node
    {
        int value;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value=value;
        }
    }
    public Node sorted(int[] arr,int s, int e)
    {
        // 1 2 3 4 5 
        if(s>e)
        {
            return null;
        }
        int mid = (s+e)/2;
        Node root = new Node(arr[mid]);
        root.left = sorted(arr,s,mid-1);
        root.right = sorted(arr, mid+1, e);

        return root;
    }
    public void preorder(Node root)
    {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[]args)
    {
        SortedArraytoBalancedBST in = new SortedArraytoBalancedBST();
        int[]arr={1,2,3,4,5};
        System.out.println("The balanced BST is : ");
        in.preorder(in.sorted(arr,0,arr.length-1));
        
    }

}
