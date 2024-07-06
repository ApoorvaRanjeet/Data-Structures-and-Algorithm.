public class reverse_array_using_recursion 
{
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5};
        reverse(arr, 0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int i)
    {
        if(i>=arr.length/2)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        reverse(arr,i+1);
    }
    
}
