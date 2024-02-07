public class palindromicarray 
{
    static int ispalin(int[] a, int n)
    {
        int pal=0;
        for(int i=0;i<n;i++)
        {
            int t = a[i];
            int s=t;
            int sum=0;
            while(s!=0)
            {
                int k=s%10;
                sum=sum*10+k;
                s=s/10;
            }
            if(sum==t)
            {
               pal++;
            }
        }
        if(pal==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] a={121,111,77};
        int n=3;
        int result = ispalin(a,n);
        System.out.println(result);
    }
}
