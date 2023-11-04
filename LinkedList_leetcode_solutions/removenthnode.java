import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class removenthnode 
{
    private ListNode head;
    private ListNode tail;
    private int length;

    class ListNode
    {
        int value;
        ListNode next;

        ListNode(int value)
        {
            this.value = value;
        }
    }
    
    public removenthnode(int value)
    {
        ListNode newNode = new ListNode(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int value)
    {
        ListNode newNode = new ListNode(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public static void printList(ListNode node)
    {
        List<Integer> values = new ArrayList<>();
           while (node != null) {
            values.add(node.value);
            node = node.next;
        }

        // Print the array
        System.out.println(Arrays.toString(values.toArray()));
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null)
        {
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if(n<0||n>=length)
        {
            return null;
        }
        if (n == length - 1) {
            // If n is the last node, remove the head
            head.next=null;
            return head;
        }
        temp=head;
        ListNode prev=head;
        for(int i=0;i<n;i++)
        {
            prev=prev.next;
            temp=temp.next;
        }
        prev=temp.next;
        temp.next=temp.next.next;
        prev.next=null;
        
        return head;
    }
    public static void main(String[]args)
    {
        removenthnode in = new removenthnode(1);
        in.append(2);
        // in.append(3);
        // in.append(4);
        // in.append(5);
        ListNode ans= in.removeNthFromEnd(in.head, 2);
        printList(ans);
    }
}
