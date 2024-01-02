import java.util.*;
public class threesumclosest 
{
    //[-1 2 1 -4]  target =1
    //closest sum 2
    public int sum(int[]nums,int target)
    {
        int ans=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1,right=nums.length-1;
            while (left<right) 
            {
                final int sum=nums[i]+nums[left]+nums[right];
                if(sum==target)
                {
                    return sum;
                }
                if(Math.abs(sum-target)<Math.abs(ans-target))
                {
                    ans=sum;
                }
                if(sum<target)
                   {
                    left++;
                   }
                else{
                    right--;
                }
               return ans; 
            }
        }
        return 0;
    }
    public static void main(String[]args)
    {
        Scanner i = new Scanner(System.in);
        threesumclosest in = new threesumclosest();
        int target=i.nextInt();
        int nums[] = {1,1,1,0};
        int ans=in.sum(nums,target);
        System.out.println(ans);
    }
    
}
