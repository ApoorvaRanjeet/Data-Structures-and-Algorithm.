public class nthnodefromtheend 
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
            this.value=value;
        }
    }
    public nthnodefromtheend(int value)
    {
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    int getNthFromLast(Node head, int n)
    {
        int l= length(head);
        if(l<n)
        {
            return -1;
        }
    	Node temp=reversenode(head);
        int i=1;
        while(i!=n)
        {
            temp=temp.next;
            i++;
        }
        return temp.value;
    }
    private Node reversenode(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        Node before=null;
        Node after=temp.next;
        while(temp!=null)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;

        }
        return before;	
    }
    private int length(Node head)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        return i;
    }
    public static void main(String[] args) 
    {
        nthnodefromtheend in = new nthnodefromtheend(1);
        in.append(2);
        in.append(3);
        in.append(4);
        in.append(5);
        in.append(6);
        in.append(7);
        in.append(8);
        in.append(9);
        int result=in.getNthFromLast(in.head,10);
        System.out.println(result);
       
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
