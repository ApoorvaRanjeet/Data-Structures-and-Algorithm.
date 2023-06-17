public class Stack  // stack class
{
    private Node top;
    private int height;
    class Node     // Node class
    {
        int value;
        Node next;
        Node(int value)   //Node constructor
        {
            this.value=value; 
        }
    }

    public Stack(int value)
    {
        Node newNode = new Node(value);
        top=newNode;
        height=1;
    }
    public void printStack()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp= temp.next;
        }
        
    }
    public void getTop()
    {
      System.out.println("top value "+top.value);
    }
    public void getheight()
    {
        System.out.println("height value "+height);
    }
    public void push(int value)
    {
        Node newNode = new Node(value);
        if(height==0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    public Node pop()
    {
        if(height==0)return null;
        Node temp = top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
}
