public class Queue_main 
{
    public static void main(String[]args)
    {
        Queue in =new Queue(3);
        in.enqueue(23);
        in.enqueue(7);
        in.enqueue(11);
        in.dequeue();
        in.printQueue();

    }
    
}
