import java.util.*;
public class preorderTraversalTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // class BinaryTree {
    //     int index = -1;

    //     public Node buildTree(int[] nodes) {
    //         index++;
    //         if (index >= nodes.length || nodes[index] == -1) {
    //             return null;
    //         }
    //         Node newNode = new Node(nodes[index]);
    //         newNode.left = buildTree(nodes);
    //         newNode.right = buildTree(nodes);
    //         return newNode;
    //     }
    // }
    // public static void preorder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return ;
    //     }
    //     System.out.println(root.value+" ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    // public static void main(String[] args) {
    //     int[] nodes = {1, 2, 4, 5, -1, -1, -1, 6, 8, -1, -1, 9, -1, -1};
    //     preorderTraversalTree outer = new preorderTraversalTree();
    //     BinaryTree inner = outer.new BinaryTree();
    //     Node tree = inner.buildTree(nodes);
    //     preorder(tree);
    // }

    public static void preOrder(Node root) {
        System.out.print(root.value + " ");

   if (root.left != null) {
       preOrder(root.left);
   } 
   
   if (root.right != null) {
       preOrder(root.right);
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

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       Node root = null;
       while(t-- > 0) {
           int data = scan.nextInt();
           root = insert(root, data);
       }
       scan.close();
       preOrder(root);
   }   
}

