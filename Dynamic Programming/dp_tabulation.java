public class dp_tabulation 
{
    static int fn(int n, int[]dp)
    {
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // with space optimization
    static int fn1(int n,int[]dp)
    {
        int prev=1;
        int prev2=0;
        for(int i=2;i<n;i++)
        {
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
