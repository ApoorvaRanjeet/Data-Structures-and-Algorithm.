import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class deletemiddleNode
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
    public deletemiddleNode(int value)
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
    public static void printlist(ListNode node)
    {
        List<Integer> values= new ArrayList<>();
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }

        // Print the array
        System.out.println(Arrays.toString(values.toArray()));
    }
    public static ListNode delete(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        while(fast!=null&&fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(temp!=null)
        {
            temp.next=slow.next;
        }
        else
        {
            head=slow.next;
        }
        return head;
    }
    public static void main(String[]args)
    {
        deletemiddleNode obj=new deletemiddleNode(1);
        obj.append(2);
        obj.append(3);
        obj.append(4);
        ListNode ans = delete(obj.head);
        printlist(ans);
    }
}
