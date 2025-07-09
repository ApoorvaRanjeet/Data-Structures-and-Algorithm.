public class minimum_subarray_sum_kadane
{
    public static int minimum(int[]arr)
    {
        int currmin=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            sum=Math.min(num,num+sum);
            currmin=Math.min(currmin,sum);
        }
        return currmin;
    }
    public static void main(String[]args)
    {
        int[]arr={5, 4, -1, 7, 8};
        System.out.print(minimum(arr));
    }
}