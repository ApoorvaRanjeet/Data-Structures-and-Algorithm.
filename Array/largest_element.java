import java.util.*;
public class largest_element 
{
    public int largest(int[]arr)
    {
        int maximum = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maximum=Math.max(arr[i],maximum);
        }
        return maximum; // optimal approach
    }
    public int largest1(int[]arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
}
