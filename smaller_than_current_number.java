import java.util.Arrays;
public class smaller_than_current_number 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int []ans=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
        {
              if((nums[i]>nums[j])&(nums[i]!=nums[j]))
              {
                s++;
              }
        } 
        ans[i]=s;
        s=0;       
    }  
    return ans;      
    }
    public static void main(String[]args)
    {
        smaller_than_current_number in=new smaller_than_current_number();
        int[]a={8,1,2,2,3};
        System.out.println(Arrays.toString(in.smallerNumbersThanCurrent(a)));
    }
}
