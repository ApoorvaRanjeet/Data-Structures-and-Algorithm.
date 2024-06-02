public class implementqueueusingarray 
{
    int front, rear;
	int arr[] = new int[100005];

    void push(int a)
    {
        if(rear<100005)
        {
            arr[rear]=a;
        }
    }
    int pop()
    {
        if(front==rear)
        {
            return -1;
        }
        else
        {
            return arr[front++];
        }
    }
    
}
