import java.util.List;

public class intersectionoftwoll {
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

    public intersectionoftwoll(int value) {
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

    public  Node findIntersection(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node current = dummy;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.value == temp2.value) {
                current.next = new Node(temp1.value);
                current = current.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if (temp1.value < temp2.value) {
                temp1 = temp1.next;
            } else {
                temp2 = temp2.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        intersectionoftwoll in = new intersectionoftwoll(1);
        in.append(2);
        in.append(4);
        in.append(6);
        in.append(7);

        intersectionoftwoll b = new intersectionoftwoll(2);
        b.append(4);
        b.append(5);
        b.append(6);

        Node list1 = in.findIntersection(in.head, b.head);
        printList(list1);
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
