import java.util.*;
public class left_rotate_array_by_k
{
    public static void rotatebrute(int[]arr,int k)
    {
        int n=arr.length;
        k=k%n;
        for(int i=0;i<k;i++)
        {
            int first=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }
    public static void reverse(int[]arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateoptimal(int[]arr,int k)
    {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5};
        // rotatebrute(arr,2);
        // System.out.println(Arrays.toString(arr));
        rotateoptimal(arr,2);
        System.out.print(Arrays.toString(arr));
    }
}