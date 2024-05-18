public class rotatell 
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
   public rotatell(int value)
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
   public Node rotate(Node head,int k)
   {
    if(head==null||k==0)
    {
        return head;
    }
    int length=1;
    Node tail=head;
    while(tail.next!=null)
    {
        tail=tail.next;
        length++;
    }
    if(k%length==0)return head;
    Node lastN=findLastNode(head,k);
    head=lastN.next;
    lastN.next=null;
    return head;
   }  
   private Node findLastNode(Node head,int k)
   {
    int cnt=1;
    Node temp=head;
    while(temp!=null)
    {
        if(cnt==k)return temp;
        temp=temp.next;
        cnt++;
    }
    return temp;
   }
}
