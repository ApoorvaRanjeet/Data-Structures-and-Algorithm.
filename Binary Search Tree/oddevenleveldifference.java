// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class oddevenleveldifference 
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
    int getLevelDiff(Node root)
	{
	    if (root == null) {
            return 0;
        }
        int s1=0,s2=0,k=0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                
                if(k%2==0)
                {
                    s1+=current.value;
                }
                else
                {
                    s2+=current.value;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            k++;
        }
        
        return s1-s2;
	}
    
}
