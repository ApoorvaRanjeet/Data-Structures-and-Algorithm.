public class min_cost_climbing_optimized
{
    public static int minclimb(int[]cost)
    {
        int n=cost.length;
        int prev1=0;
        int prev2=0;
        for(int i=2;i<=n;i++)
        {
            int curr=Math.min(prev1+cost[i-1],prev2+cost[i-2]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String[]args)
    {
        int[]cost={10,15,20};
        System.out.println(minclimb(cost));
    }
}