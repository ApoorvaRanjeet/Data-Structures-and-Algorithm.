import java.util.*;
public class house_robber
{
    public static int rob(int[] nums) 
{
    int n=nums.length;
    if(n<1)
    {
        return 0;
    }
    if(n==1)
    {
        return nums[0];
    }
    int prev2=0;
    int prev1=nums[0];
    for(int i=1;i<n;i++)
    {
        int curr=Math.max(prev1,nums[i]+prev2);
        prev2=prev1;
        prev1=curr;
    }
    return prev1;
}
public static void main(String[]args)
{
    int[]nums={2,7,9,3,1};
    System.out.println(rob(nums));
}
}