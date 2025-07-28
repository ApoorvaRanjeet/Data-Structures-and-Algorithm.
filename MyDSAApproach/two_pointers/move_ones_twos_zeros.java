import java.util.*;
public class move_ones_twos_zeros
{
    //this is basically the dutch algorithm 
    public static int[] move(int[]arr)
    {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==2)
            {
                swap(arr,mid,high);
                high--;
            }
            else
            {
                mid++;
            }
        }
        return arr;
    }
    private static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[]args)
    {
        int[]arr={2,0,1};
        System.out.print(Arrays.toString(move(arr)));
    }
}