import java.util.*;
import java.util.Queue;
public class levelordertree 
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
   public static void levelorder(Node root)
   {
    if(root==null)
    {
        return;
    }
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        Node currNode = q.remove();
        if(currNode==null)
        {
            System.out.println();
            if(q.isEmpty())
            {
                break;
            }
            else
            {
                q.add(null);
            }
        }
        else
        {
            System.out.print(currNode.value+" ");
            if(currNode.left!=null)
            {
                q.add(currNode.left);
            }
            if(currNode.right!=null)
            {
                q.add(currNode.right);
            }
        }
    }
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
       levelorder(root);
   }   
    
}
