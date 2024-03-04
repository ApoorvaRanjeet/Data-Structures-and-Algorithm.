public class iscircularll 
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
    public iscircularll(int value)
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
    public boolean iscircular(Node head) 
    {
        if (head == null || head.next == null) {
            return false; // Not a circular list if it's empty or has only one node
        }
    
        Node slow = head;
        Node fast = head.next;
    
        while (fast != null && fast.next != null) {
            if (slow == fast || slow == fast.next) {
                return true; // Found a cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return false; 
    }
    public static void main(String[] args) 
    {
        iscircularll in = new iscircularll(1);
        in.append(2);
        in.append(3);
        in.append(4);
        in.append(5);
        boolean ans=in.iscircular(in.head);
        System.out.println(ans);
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
