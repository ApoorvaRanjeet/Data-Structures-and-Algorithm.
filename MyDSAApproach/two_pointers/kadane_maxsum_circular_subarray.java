// import java.util.*;
public class kadane_maxsum_circular_subarray
{
    public static int kadane(int[]arr)
    {
        int currMin=0;
        int maxSum=Integer.MIN_VALUE;
        int currMax=0;
        int minSum=Integer.MAX_VALUE;
        int total=0;
        for(int num:arr)
        {
            total+=num;
            
            currMax=Math.max(num,currMax+num);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.min(num,currMin+num);
            minSum=Math.min(currMin,minSum);

        }
        if(maxSum<0)
        {
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
    }
    public static void main(String[]args)
    {
        int[]arr={5,-3,5};
        System.out.print(kadane(arr));
    }
}