
public class the_secret_sequence
{
    // question is about fincding the contiguous subarrays whose sum <=k and among those subarrays 
    //whose elemsts product sum is maximum
    public static int maximum(int[]arr,int target,int k)
    {
        int n=arr.length;
        int maxProd=-1;
        int currSum=0;
        int currProd=0;
        int right=0;
        int left=0;
        while(right<n)
        {
            currSum+=arr[right];
            currProd+=arr[right]*arr[right];

            while(currSum>target || (right-left+1)>k)
            {
                currSum-=arr[left];
                currProd-=arr[left]*arr[left];
                left++;
            }
            if(currSum==target && (right-left+1)<=k)
            {
                maxProd=Math.max(maxProd,currProd);
            }
            right++;
        }
        return maxProd;
    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,2,1};
        System.out.print(maximum(arr,5,3));
    }
}