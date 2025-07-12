import java.util.*;
public class left_rotate_by_1
{
    public static void rotate(int[]arr)
    {
        int n=arr.length;
        int first=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5};
        rotate(arr);
        System.out.print(Arrays.toString(arr));
    }
}