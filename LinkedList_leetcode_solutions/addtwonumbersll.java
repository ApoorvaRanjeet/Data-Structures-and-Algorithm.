

public class addtwonumbersll 
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
    public addtwonumbersll(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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
    public Node addTwoLists(Node first, Node second) {
        // Reverse the input lists
        first = reverseList(first);
        second = reverseList(second);
        
        // Initialize dummy node and current pointer
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
    
        // Perform addition
        while (first != null || second != null || carry != 0) {
            int sum = carry;
    
            if (first != null) {
                sum += first.value;
                first = first.next;
            }
    
            if (second != null) {
                sum += second.value;
                second = second.next;
            }
    
            carry = sum / 10;
            sum = sum % 10;
    
            current.next = new Node(sum);
            current = current.next;
        }
    
        // Reverse the result list
        Node result = reverseList(dummy.next);
    
        return result;
    }
    
    // Helper method to reverse a linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
    
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
    
        return prev;
    }
    
    public static void main(String[] args) 
    {
        addtwonumbersll in = new addtwonumbersll(4);
        in.append(5);
        addtwonumbersll a= new addtwonumbersll(3);
        a.append(4);
        a.append(5);
        Node result = in.addTwoLists(in.head,a.head);
        printList(result);
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
