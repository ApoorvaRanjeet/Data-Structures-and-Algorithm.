public class circularll 
{
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public circularll(int value)
    {
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void circular()
    {
        Node temp=head;
        if(temp!=null)
        {
            do
            {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }while(temp!=null);

        }

    }
    public static void main(String[] args) 
    {
        circularll in = new circularll(23);
        in.append(24);
        in.append(5);
        in.circular();
        
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
