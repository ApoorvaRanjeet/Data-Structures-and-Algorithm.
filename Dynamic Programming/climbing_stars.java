public class climbing_stars {
    public int climbing(int n)
    {
        // this prblm is same as fibonacci
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int prev1=1;
        int prev=2;
        for(int i=3;i<=n;i++)
        {
            int curr=prev1+prev;
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
}
