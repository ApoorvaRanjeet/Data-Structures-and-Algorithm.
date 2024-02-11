public class intersectionofarray 
{
    void intersection(int[]a , int m, int[]b, int n)
    {
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        intersectionofarray in = new intersectionofarray();
        int [] a= {1,2,3,4,6};
        int[] b= {2,3,5,7};
        int m=5;
        int n=4;
        in.intersection(a,m,b,n);
    }
    
}
