public class sumoflongestpathnode 
{
    Node root;
    int maxlen=0;
    int maxsum=0;
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
    public boolean insert(int value)
    {
        Node newNode = new Node(value);
        if(root==null)
        {
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true)
        {
            if(newNode.value==temp.value)
            {
                return false;
            }
            if(newNode.value<temp.value)
            {
                if(temp.left==null)
                {
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }

        }

    }

    public int sumOfLongRootToLeafPath(Node root)
    {
        maxlen=0;
        maxsum=0;
        dfs(root,maxlen,maxsum);
        return maxsum;

    }
    private void dfs(Node root,int pathlen,int pathsum)
    {
        if(root==null)
        {
            if(pathlen>maxlen)
            {
                maxsum=pathsum;
                maxlen=pathlen;
            }
            else if(pathlen==maxlen && pathsum>maxsum)
            {
                maxsum=pathsum;
            }
            return;
        }
        dfs(root.left,pathsum+root.value,pathlen+1);
        dfs(root.right,pathsum+root.value,pathlen+1);
    }
        public static void main(String[]args)
    {
        sumoflongestpathnode in = new sumoflongestpathnode();
        in.insert(4);
        

    }
    
}
