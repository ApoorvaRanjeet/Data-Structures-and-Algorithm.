


public class minimumelementinBST 
{
    Node root;

    class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value=value;
        }
    }
    int minValue(Node node) 
    {
        if(node==null)
        {
            return -1;
        }
        int min=node.value;
        while(node.left!=null)
        {
            if(node.left.value<min)
            {
                min=node.left.value;
            }
            node = node.left;
        }
        return min;
    }
    
}
