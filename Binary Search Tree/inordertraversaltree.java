import java.util.Scanner;

public class inordertraversaltree 
{
    static Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public static Node insert(Node root, int data) {
       if(root == null) {
           return new Node(data);
       } else {
           Node cur;
           if(data <= root.value) {
               cur = insert(root.left, data);
               root.left = cur;
           } else {
               cur = insert(root.right, data);
               root.right = cur;
           }
           return root;
       }
   }
   public static void inorder(Node root)
   {
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.print(root.value+" ");
    inorder(root.right);
   }

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       Node root = null;
       while(t> 0) {
           int data = scan.nextInt();
           root = insert(root, data);
           t--;
       }
       scan.close();
       inorder(root);
   }   
}
