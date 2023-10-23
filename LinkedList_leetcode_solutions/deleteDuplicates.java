import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.Node;

public class deleteDuplicates 
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
        public deleteDuplicates(int value)
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
        public ListNode delete()
        {
            ListNode current = head;
            ListNode temp=null;
            ListNode index = null;
            if(current==null)
            {
                return null;
            }
            else
            { 
                while(current!=null)
                {
                    temp=current;
                    index=current.next;
                    while(index!=null)
                    {
                        if(temp.value==index.value)
                        {
                            temp.next=index.next;
                            
                        }
                        else
                        {
                            temp=index;
                            
                        }
                        index=index.next;
                    }
                    current=current.next;
                }

            }
           return head; 
        }

        public static void main(String[]args)
        {
            deleteDuplicates in =new deleteDuplicates(1);
            in.append(2);
            in.append(2);
            in.append(3);
            in.append(4);
            ListNode ans = in.delete();
            printList(ans);
        }
    }
