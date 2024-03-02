public class reversellofgivensize {
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

    public reversellofgivensize(int value) {
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

    public Node reverse(Node head, int k) {
        Node dummy = new Node(-1);
        Node dummyTail = dummy;

        Node current = head;

        while (current != null) {
            Node subListHead = null;
            Node subListTail = current;
            int count = 0;

            // Reverse the sublist of size k
            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = subListHead;
                subListHead = current;
                current = nextNode;
                count++;
            }

            // Connect the sublist to the result list
            dummyTail.next = subListHead;
            dummyTail = subListTail;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        reversellofgivensize in = new reversellofgivensize(1);
        in.append(2);
        in.append(3);
        in.append(4);
        in.append(5);
        in.append(6);
        in.append(7);

        // Call the reverse method using the instance
        Node reversedListHead = in.reverse(in.head, 4);
        
        // Print the reversed list
        printList(reversedListHead);
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

