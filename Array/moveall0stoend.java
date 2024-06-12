public class moveall0stoend 
{
    public static void move(int[]arr,int n)
    {
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={12,0,3,0,6,1,0,5};
        int n=arr.length;
        move(arr,n);
       for(int i=0;i<n;i++)
       {
        System.out.print(arr[i]+" ");
       }
    }
    
}
