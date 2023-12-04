

public class mergepoints 
{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value)
        {
            this.value=value;
        }
    }
    public mergepoints(int value)
    {
        Node newNode  =new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public static int intersection(Node head1,Node head2)
    {
        while(head2!=null)
        {
            Node temp=head1;
            while(temp!=null)
            {
                if(head2.value==temp.value)
                {
                    return head2.value;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return -1;
    }
    public static void main(String[]args)
    {
        mergepoints a = new mergepoints(3);
        a.append(6);
        a.append(9);
        a.append(15);
        a.append(30);
        mergepoints b = new mergepoints(1);
        b.append(10);
        b.append(15);
        b.append(30);
        int ans = intersection(a.head, b.head);
        System.out.println(ans);
    }
    
}
