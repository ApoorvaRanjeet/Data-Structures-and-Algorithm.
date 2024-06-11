import java.util.Arrays;
public class SecondLargestElement 
{
    public static int brute(int[]arr,int n)
    {
        Arrays.sort(arr);
        int largest=arr[n-1];
        int second=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                second=arr[i];
                break;
            }
        }
        return second;
    }
    public static int better(int[] arr,int n)
    {
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]!=largest)
            {
                slargest=arr[i];
            }
        }
        if(slargest==Integer.MIN_VALUE)
        {
            return -1;
        }
        else
        {
            return slargest;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,8,3,0,4,1,8};
        int n=arr.length;
        System.out.println(better(arr,n));

    }
    
}
