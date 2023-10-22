import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class mergesortedlist {
    private ListNode head;
    private ListNode tail;
    private int length;

    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public mergesortedlist(int value) {
        ListNode newNode = new ListNode(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode temp = list3;
        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 == null) {
            temp.next = list2;
        }
        if (list2 == null) {
            temp.next = list1;
        }
        return list3.next;
    }

    public static void printList(ListNode node) {
        // Create an array to store the values
        List<Integer> values = new ArrayList<>();
        
        // Traverse the list and add values to the array
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }

        // Print the array
        System.out.println(Arrays.toString(values.toArray()));
    }

    public static void main(String[] args) {
        mergesortedlist a = new mergesortedlist(1);
        a.append(2);
        a.append(4);
        mergesortedlist b = new mergesortedlist(1);
        b.append(3);
        b.append(4);
        ListNode list3 = a.mergeTwoLists(a.head, b.head);

        printList(list3);
    }
}
