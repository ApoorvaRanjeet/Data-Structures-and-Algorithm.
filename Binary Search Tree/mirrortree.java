
public class mirrortree 
{
    void mirror(Node node) {
        if(node==null)
        {
            return;
        }
        mirror(node.right);
        System.out.print(node.value+" ");
        mirror(node.left);
        }
    
    
    class Node {
        int value;
        Node left, right;
    
        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    
}