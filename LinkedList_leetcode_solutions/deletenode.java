import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deletenode
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
    public deletenode(int value)
    {
        ListNode newNode = new ListNode(value);
        head = newNode;
        tail = newNode;
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
    public static ListNode delete(ListNode head,int node)
    {
        if(head==null)
        {
            return null;
        }
        if(head.value==node)
        {
            return head.next;
        }
        else
        {
            ListNode temp=head.next;
            ListNode prev=head;
            while(temp!=null)
            {
                if(temp.value==node)
                {
                    prev.next=temp.next;
                    temp=temp.next;
                }
                else
                {
                    temp=temp.next;
                }
                prev=prev.next;
            }
        }
        return head;
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
    public static void main(String[] args) 
    {
        deletenode in =new deletenode(1);
        in.append(2);
        in.append(3);
        in.append(4);
        in.append(5);
        in.append(6);
        ListNode ans = in.delete(in.head,5);
        printlist(ans);

        
    }
}