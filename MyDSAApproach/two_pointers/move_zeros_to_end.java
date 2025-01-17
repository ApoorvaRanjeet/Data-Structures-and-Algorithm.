public class move_zeros_to_end 
{
    public static int[] zeros(int[]arr)
    {
        if(arr.length==0)
        {
            return null;
        }
        int l=0;
        for(int r=0;r<arr.length;r++)
        {
            if(arr[r]!=0)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
        }
return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] result = zeros(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
