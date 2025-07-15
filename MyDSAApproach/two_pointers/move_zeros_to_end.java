import java.util.*;

public class move_zeros_to_end
{
    public static int[] movezeros(int[]arr)
    {
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
        return arr;
    }
    public static void main(String[]args)
    {
        int[]arr={1,0,2,3,0};
        System.out.print(Arrays.toString(movezeros(arr)));
    }
}