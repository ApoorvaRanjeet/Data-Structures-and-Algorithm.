public class mergesortll {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public mergesortll(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middle(head);
        Node right = mid.next;
        mid.next = null;
        Node left = head;
        left = mergeSort(left);
        right = mergeSort(right);
        return mergetwolist(left, right);
    }

    private static Node mergetwolist(Node left, Node right) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while (left != null && right != null) {
            if (left.value < right.value) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        if (left == null) {
            temp.next = right;
        }
        if (right == null) {
            temp.next = left;
        }
        return dummyNode.next;
    }

    private static Node middle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        mergesortll in = new mergesortll(1);
        in.append(4);
        in.append(5);
        in.append(2);
        in.append(3);
        Node result = mergeSort(in.head);
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

