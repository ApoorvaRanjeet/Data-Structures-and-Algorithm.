import java.util.Scanner;
public class BSTwithRecursion 
{
    static Node root;
    static class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value=value;
        }
    }
    public static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        Node temp;
        if(root.value>data)
        {
            temp=insert(root.left,data);
            root.left=temp;
        }
        else
        {
            temp=insert(root.right,data);
            root.right=temp;
        }
        return root;
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.value>key)
        {
            return search(root.left,key);
        }
        else if(root.value==key)
        {
            return true;
        }
        else
        {
            return search(root.right,key);
        }
        
    }
    public static void main(String[]args)
    {
        BSTwithRecursion a= new BSTwithRecursion();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int data=in.nextInt();
            root=insert(root,data);
            t--;
        }
        if(search(root, 1))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
    
}
