import java.util.*;
public class insertion_sort
{
    public static void insertion(int[]arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
        public static void main(String[]args)
        {
            int[]arr={5,4,3,2,1};
            insertion(arr);
            System.out.print(Arrays.toString(arr));
        }
    }
