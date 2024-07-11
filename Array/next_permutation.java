import java.util.*;
public class next_permutation 
{
    public static void permutation(int[] nums)
    {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--)//breaking point
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            reverse(nums,0,nums.length);

        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp= nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }

        }
        reverse(nums,ind+1,nums.length-1);
    }
    public static void reverse(int[]nums,int i, int j)
    {
        if(i>=j)
        {
            return;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        reverse(nums,i+1,j-1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
