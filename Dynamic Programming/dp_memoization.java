import java.util.Arrays;

public class dp_memoization 
{
    static int fn(int n, int[]dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=fn(n-1,dp)+fn(n-2,dp);
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fn(n,dp));
    }
}
