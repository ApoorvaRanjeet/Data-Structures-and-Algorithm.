public class removeduplicatesformsortedarray 
{
    public static int remove(int[]arr,int n)
    {
        int j=0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4, 4};
        int N = array.length;
        int uniqueCount = remove(array, N);
    
        // Print the modified array and the count of unique elements
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nCount of unique elements: " + uniqueCount);
    }
    
}
