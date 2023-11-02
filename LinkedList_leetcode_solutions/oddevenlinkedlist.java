import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class oddevenlinkedlist 
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
            this.value=value;
        }
    }
    public oddevenlinkedlist(int value)
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
           while (node!= null) {
            values.add(node.value);
            node = node.next;
        }
        System.out.println(Arrays.toString(values.toArray()));
    }
    public ListNode oddeven(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=even;
        while(even!=null&&even.next!=null)
        {
            odd.next=odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public static void main(String[]args)
    {
        oddevenlinkedlist a = new oddevenlinkedlist(1);
        a.append(2);
        a.append(3);
        a.append(4);
        a.append(5);
        a.append(6);
        ListNode ans=a.oddeven(a.head);
        printList(ans);
    }
}
