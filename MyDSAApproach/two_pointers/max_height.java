// import java.util.*;
public class max_height 
{
    public static int maxheight(int[]arr)
    {
        if(arr==null||arr.length<2)
        {
            return 0;
        }
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right)
        {
            int area=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(max,area);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxheight(arr));
    }
}
