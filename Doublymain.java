public class Doublymain 
{
    public static void main(String[]args)
    {
            Doublylinkedlist dll =new Doublylinkedlist(2);
            
            dll.append(23);
            dll.getHead();
            dll.getTail();
            dll.removeLast();
            dll.prepend(3);
            dll.removefirst();
            dll.get(2);
            dll.set(1, 3);
            dll.insert(2, 9);
            dll.remove(2);
            dll.printlist();
            
    }
    
    
}
