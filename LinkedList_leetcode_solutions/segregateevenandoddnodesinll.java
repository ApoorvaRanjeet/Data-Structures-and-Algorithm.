import java.util.Stack;
public class segregateevenandoddnodesinll 
{
    private Node head;
   private Node tail;
   private int length;

   class Node
   {
        int value;
        Node next;

        Node(int value)
        {
            this.value=value;
        }
   }
   public segregateevenandoddnodesinll(int value)
   {
       Node newNode= new Node(value);
       head=newNode;
       tail=newNode;
       length=1;
   }
   public void printlist()
   {
       Node temp=head;
       while(temp!=null)
       {
           System.out.println(temp.value);
           temp=temp.next;
       }
   }
   public void append(int value)
   {
       Node newNode = new Node(value);
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
   Node divide(int N, Node head) {
    if (head == null || head.next == null) {
        // If the list is empty or has only one node, no modification is needed
        return head;
    }

    Node evenHead = null;
    Node evenTail = null;
    Node oddHead = null;
    Node oddTail = null;

    Node curr = head;
    while (curr != null) {
        if (curr.value % 2 == 0) { // If the current node is even
            if (evenHead == null) {
                evenHead = curr;
                evenTail = curr;
            } else {
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
        } else { // If the current node is odd
            if (oddHead == null) {
                oddHead = curr;
                oddTail = curr;
            } else {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
        }
        curr = curr.next;
    }

    if (evenHead == null || oddHead == null) {
        // If there are no even nodes or no odd nodes, no modification is needed
        return head;
    }

    evenTail.next = oddHead; // Connect the even nodes to the odd nodes
    oddTail.next = null; // Terminate the list after the last odd node

    return evenHead; // Return the head of the modified list
}
public static void main(String[] args) {
    segregateevenandoddnodesinll in = new segregateevenandoddnodesinll(17);
    in.append(15);
    in.append(8);
    in.append(9);
    in.append(2);
    in.append(4);
    in.append(6);
    Node ans=in.divide(7,in.head);
    Node temp = ans;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    
}
}
