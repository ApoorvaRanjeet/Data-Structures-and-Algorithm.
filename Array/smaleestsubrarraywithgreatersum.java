public class smaleestsubrarraywithgreatersum 
{
    public static int smallestSubWithSum(int a[], int n, int x) 
    {
        int right=0,left=0,sum=0;
        int minlen=Integer.MAX_VALUE;
        while(right<n)
        {
            while(sum<=x &&right<n)
            {
                sum+=a[right];
                right++;
            }
            while(sum>x && left<right)
            {
                minlen=Math.min(minlen,right-left);
                sum-=a[left];
                left++;
            }

        }
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
    
}
