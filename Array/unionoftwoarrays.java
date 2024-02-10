import java.util.HashSet;

public class unionoftwoarrays 
{
    void union(int[]arr,int[] a)
    {
        int n = arr.length;
        int m = a.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr[i] < a[j]) {
                System.out.print(arr[i] + " ");
                i++;
            } else if (a[j] < arr[i]) {
                System.out.print(a[j] + " ");
                j++;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }
        while (i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(a[j] + " ");
            j++;
        }
        // based on geeks for geeks solution 
        // HashSet<Integer> unionSet = new HashSet<>();
        
        // // Adding elements of array 'a' to the set
        // for (int i = 0; i < n; i++) {
        //     unionSet.add(a[i]);
        // }
        
        // // Adding elements of array 'b' to the set
        // for (int i = 0; i < m; i++) {
        //     unionSet.add(b[i]);
        // }
        
        // // Returning the size of the set, which represents the count of distinct elements
        // return unionSet.size();
    }
    public static void main(String[] args) {
        unionoftwoarrays in = new unionoftwoarrays();
        int[] arr= {1,2,3,4,6};
        int[] a= {2,3,5,7};
        in.union(arr,a);
    }
}
