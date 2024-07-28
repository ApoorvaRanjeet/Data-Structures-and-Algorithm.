class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class binaryno_in_a_ll 
{
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            decimalValue = (decimalValue << 1) | currentNode.val;
            currentNode = currentNode.next;
        }

        return decimalValue;
    }
    
}
