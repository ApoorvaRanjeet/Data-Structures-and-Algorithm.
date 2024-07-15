public class Kadanes_algo 
{
    public static long maxSubArraySum(int[]arr)
    {
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={1, 2, 3, -2, 5};
        System.out.println(maxSubArraySum(arr));
    }
    
}
