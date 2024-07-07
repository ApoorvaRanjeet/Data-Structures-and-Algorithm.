public class coin_change 
{
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int n=coins.length;
        int sum=4;
System.out.println(count(coins,n,sum));
    }
    static long count(int[]coins,int n,int sum)
    {
        int[] dp= new int[sum+1];
        dp[0]=1;//only 1 way to make sum=0 i.e. by choosing no coin
        for(int coin: coins)
        {
            for(int j=coin;j<=sum;j++)
            {
                dp[j]+=dp[j-coin];
            }
        }
return dp[sum];
    }
}
