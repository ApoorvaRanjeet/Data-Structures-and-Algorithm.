public class main
{
    public static void main(String[]args)
    {
        linkedlist myLinkedList = new linkedlist(4);
        myLinkedList.append(2);

        myLinkedList.prepend(1);
        // myLinkedList.removefirst();
        myLinkedList.set(1, 4);
        myLinkedList.insert(3, 6);
        myLinkedList.remove(0);
        myLinkedList.reverse();
        myLinkedList.printlist();
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        // 2 items : returns 2 nodes
        // System.out.println(myLinkedList.removeLast());
        // // 1 item : returns 1 node
        // System.out.println(myLinkedList.removeLast());
        // //0 item : returns null
        // System.out.println(myLinkedList.removeLast());
    }

}
