import java.util.*;
public class not_even_max_sum
{
    public static int maxSum(int[] nums)
    {
        int n=nums.length;
        int sum=0;
        int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(nums[i]%2!=0)
            {
                minOdd=Math.min(minOdd,nums[i]);
            }
        }
        if(sum%2!=0)
        {
            return sum;
        }
        if(minOdd==Integer.MAX_VALUE)
        {
            return 0;
        }
        return sum-minOdd;
    }
    public static void main(String[]args)
    {
        int[]nums={8 ,5 ,3 ,6 ,4 ,2};
        System.out.print(maxSum(nums));
    }
}