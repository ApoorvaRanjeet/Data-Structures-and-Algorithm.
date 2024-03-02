import org.w3c.dom.Node;
import java.util.Stack;
public class llispalindrome 
{
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public llispalindrome(int data)
    {
        Node newNode = new Node(data);
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

    public boolean isPalindrome(Node head) 
    {
    //     if(head==null||head.next==null) return true;
    //     Node slow=head;
    //     Node fast=head;
    //     while(fast!=null&&fast.next!=null)
    //     {
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     Node firsthalf=head;
    //     Node secondhalf=reverse(slow);
    //     while(secondhalf!=null)
    //     {
    //         if(firsthalf.value!=secondhalf.value)
    //         {
    //                return false;
    //         }
    //         secondhalf=secondhalf.next;
    //         firsthalf=firsthalf.next;
    //     }
    //     return true;
    // } 
    // private Node reverse(Node head)
    // {
    //     Node temp=head;
    //     Node before=null;
    //     Node after=temp.next;
    //     while(temp!=null)
    //     {
    //         after=temp.next;
    //         temp.next=before;
    //         before=temp;
    //         temp=after;
    //     }
    //     return before;
            // Base cases: empty list or single-node list
            if (head == null || head.next == null) {
                return true;
            }
            
            // Use a stack to store the first half of the list
            Stack<Integer> stack = new Stack<>();
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                stack.push(slow.data);
                slow = slow.next;
                fast = fast.next.next;
            }
            
            // If the length of the list is odd, skip the middle node
            if (fast != null) {
                slow = slow.next;
            }
            
            // Compare the second half of the list with the elements popped from the stack
            while (slow != null) {
                if (slow.data != stack.pop()) {
                    return false;
                }
                slow = slow.next;
            }
            
            return true;
    } 
    public static void main(String[] args) 
    {
        llispalindrome in = new llispalindrome(5);
        // in.append(5);
        in.append(1);
        in.append(1);
        in.append(5);
        in.append(4);
        in.append(3);
        in.append(2);
        in.append(3);
        in.append(3);
        in.append(3);
        in.append(3);
        in.append(3);
        in.append(2);
        in.append(2);
        in.append(1);
        in.append(2);
        in.append(2);
        in.append(1);
        in.append(5);
        in.append(5);
        in.append(5);
        in.append(1);
        in.append(5);
        in.append(2);
        in.append(3);
        in.append(3);
        in.append(2);
        in.append(2);
        in.append(1);
        in.append(5);
        in.append(3);
        in.append(3);
        in.append(2);
        in.append(3);
        in.append(4);
        in.append(2);
        in.append(1);
        in.append(2);
        in.append(4);
        in.append(5);
        in.append(5);
        in.append(4);
        in.append(2);
        in.append(3);
        in.append(5);
        boolean result = in.isPalindrome(in.head);
        System.out.println(result);
        
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
