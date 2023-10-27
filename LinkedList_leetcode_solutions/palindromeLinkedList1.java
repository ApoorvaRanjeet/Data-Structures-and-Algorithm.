import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class palindromeLinkedList1
{private ListNode head;
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
    public palindromeLinkedList1(int value)
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
   public static boolean palindrome(ListNode head)
{
    LinkedList<Integer> list = new LinkedList<Integer>();
    ListNode temp = head;
    
    // Calculate the length of the linked list
    int length = 0;
    while (temp != null) {
        list.add(temp.value);
        temp = temp.next;
        length++;
    }
    
    // Initialize the array with the correct size
    Integer[] arr = new Integer[length];
    
    // Copy elements from the list to the array
    list.toArray(arr);
    
    int s=0;
    int e=length-1;
    while(s<=e)
    {
        if(arr[s]!=arr[e])
        {
            return false;
        }
        s++;
        e--;
    }
    return true;
}
public static void main(String[]args)
{
    palindromeLinkedList1 in =new palindromeLinkedList1(1);
    in.append(2);
    in.append(2);
    in.append(1);
    boolean a = palindrome(in.head);
    if(a==false)
    {
        System.out.println("Not Palindrome");
    }
    else
    {
        System.out.println("Palindrome");
    }
}
    
}
