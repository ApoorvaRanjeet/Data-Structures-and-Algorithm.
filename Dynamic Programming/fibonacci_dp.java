public class fibonacci_dp 
{
    public int fibonacci(int n)
    {
        int prev1=0;
        int prev=1;
        for(int i=2;i<=n;i++)
        {
            int curr=prev1+prev;
            prev1=prev;
            prev=curr;
        }
        return n==0?prev1:prev;
    }
    
}
