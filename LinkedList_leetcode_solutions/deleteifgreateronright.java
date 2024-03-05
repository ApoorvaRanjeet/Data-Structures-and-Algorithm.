public class deleteifgreateronright 
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
    public deleteifgreateronright(int value)
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
    Node compute(Node head)
    {
        Node temp = head;
    Node before = null;

    while (temp != null && temp.next != null) {
        Node after = temp.next;
        if (temp.value < after.value) {
            if (before == null) { // if before is null, we are removing the head
                head = after;
            } else {
                before.next = after;
            }
            temp = after; // skip the current node
        } else {
            before = temp;
            temp = temp.next;
        }
    }
    return head;
    }
    public static void main(String[] args) 
    {
        deleteifgreateronright in = new deleteifgreateronright(12);
        in.append(13);
        in.append(14);
        in.append(15);
        Node before=in.compute(in.head);
        printList(before);
        
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
