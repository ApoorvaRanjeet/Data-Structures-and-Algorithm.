public class implementstackusingarray 
{
    int top;
	int arr[] = new int[1000];

    implementstackusingarray()
    {
        top=-1;
    }
    void push(int a)
    {
        if(top<=999)
        {
            arr[++top]=a;
        }
        
    }
    int pop()
    {
        if(top>=0)
        {
            return arr[top--];
        }
        else
        {
            return -1;
        }
    }
    
}
