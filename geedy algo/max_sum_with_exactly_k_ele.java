public class max_sum_with_exactly_k_ele 
{
    public static int max_sum(int[] arr, int k) 
    {
        int sum=0;
        int m=arr[arr.length-1];
        for(int i=0;i<k;i++)
        {
            sum+=m;
            m=m+1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(max_sum(arr, 3));
    }
}
   
    

