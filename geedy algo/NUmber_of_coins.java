public class NUmber_of_coins 
{
    public static int mincoins(int[]coins,int M,int V)
    {
        int[]dp=new int[V+1];
        dp[0]=0;
        int inf=Integer.MAX_VALUE;
        for(int i=1;i<=V;i++)
        {
            dp[i]=inf;
        }
        for(int i=0;i<M;i++)
        {
            for(int j=coins[i];j<=V;j++)
            {
                if(dp[j-coins[i]]!=inf)
                {
                    dp[j]= Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[V]==inf ? -1:dp[V];
    }
    public static void main(String[] args) {
        int[] coins={9,6,5,1};
        int M=4;
        int V=11;
        System.out.println(mincoins(coins, M, V));
    }
}
