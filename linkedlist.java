public class linkedlist
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
   public linkedlist(int value)
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
    public void getHead()
    {
        System.out.println("the value of head "+head.value);
    }
    public void getTail()
    {
        System.out.println("the value of tail "+tail.value);
    }
    public void getLength()
    {
        System.out.println("the length of linkedlist "+length);
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
    public Node removeLast()
    {
        if (length==0) return null;
        Node temp=head;
        Node pre=head;
        while(temp.next!=null)
        {
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0)
        {
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend(int value)
    {
        Node newNode =new Node(value);
        if(length==0)   
        {
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    public Node removefirst()
    {
        if (length==0)
        {
            return null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0)
        {
            tail=null;
        }
        return temp;
    }
    public Node get(int index)
    {
        if (index<0||index>=length)
        {
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;

        }
        return temp;
    }
    public boolean set(int index,int value)
    {
        Node temp =get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value)
    {
        if(index<0||index>length)
           return false;
        if(index==0)
        {
            prepend(value);
            return true;
        }   
        if(index==length)
        {
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }
    public Node remove(int index)
    {
        if(index <0|| index>length)
        {
            return null;
        }
        if(index==0)
        {
            return removefirst();
        }
        if(index==length-1)
        {
            return removeLast();
        }
        Node temp=get(index-1);
        Node prev=temp.next;
        temp.next=prev.next;
        prev.next=null;
        length--;
        return temp;
        }
        public void reverse()
        {
            Node temp=head;
            head=tail;
            tail=temp;
            Node after=temp.next;
            Node before=null;
            for(int i=0;i<length;i++)
            {
                after=temp.next;
                temp.next=before;
                before=temp;
                temp=after;
            }
        }
    }
   
