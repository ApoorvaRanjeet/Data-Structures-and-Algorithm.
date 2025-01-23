import java.util.*;
public class subarray_product_less_than_k
{
    public static int subarray(int[]nums,int k)
    {
        int product=1;
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            product*=nums[right];
            while(product>=k)
            {
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public static void main(String[]args)
    {
        int[]nums={10,5,2,6};
        int k=100;
        System.out.println(subarray(nums,k));
    }
}