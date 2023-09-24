import java.util.Arrays;
public class Running_sum_of_1d_array 
{
    public int[] runningSum(int[] nums)
    {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(i==0)
            {
                ans[i]=nums[i];
            }
            for(int j=i+1;j<=i+1;j++)
            {
                ans[i+1]=ans[i]+nums[j];
            }
        }
        return ans;  
    }
    public static void main(String[]args)
    {
        Running_sum_of_1d_array in=new Running_sum_of_1d_array();
        int[]a={1,2,3,4};
        System.out.println(Arrays.toString(in.runningSum(a)));
    }
    
}
