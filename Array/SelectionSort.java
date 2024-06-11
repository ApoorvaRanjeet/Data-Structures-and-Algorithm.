public class SelectionSort 
{
    public static int select(int[] arr,int i)
    {
        int min=i;
        for(int j=i+1;j<arr.length-1;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
return min;
    }
    public static void sort(int[]arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int minIndex=select(arr, i);
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        // SelectionSort in = new SelectionSort();
        int[]arr={3,8,2,1,7};
        int n=arr.length;
        sort(arr, n);
        
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
