import java.util.Arrays;
public class concatentaion_of_array 
{
    public static int[] concatenate(int[]nums)
    {
        int n=nums.length;
        int[] ans= new int[2*nums.length];
        for(int i=0;i<2*n;i++)
        {
            ans[i]=nums[i%n];
        }
return ans;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3};
        int[]ans=concatenate(nums);
        System.out.println(Arrays.toString(ans));
    }
    
}
