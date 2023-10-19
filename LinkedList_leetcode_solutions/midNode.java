public class midNode 
{ 
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
       int value;
       Node next;

       Node(int value)
       {
        this.value = value;
       }
    }
    public midNode(int value)
    {
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
        
    }
    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public  Node middleNode()
    {
        Node slow = head;
        Node fast = head;
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[]args)
    {
        midNode in = new midNode(1);
        in.append(2);
        in.append(3);
        in.append(4);
        in.printList();
        Node mid = in.middleNode();
        System.out.println(mid.value);
    }
}
