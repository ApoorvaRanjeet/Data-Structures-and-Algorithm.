public class Maxsum_in_subarray 
{
    public static long pairWithMaxSum(long arr[], long N) {
        if(N<2)
        {
            return 0;
        }
        long sum=0;
        long max=0;
        for(int i=0;i<N-1;i++)
        {
            sum=arr[i]+arr[i+1];
            max=Math.max(max,sum);
        }
        return max;
    }
    
}
