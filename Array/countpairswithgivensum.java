import java.util.HashMap;

public class countpairswithgivensum 
{
    int getPairsCount(int[] arr, int n, int k) 
    {

        //[1 5 7 1]  // 6
        // int count=0;
        // for(int i=0;i<n-1;i++)
        // {
        //   for(int j=i+1;j<n;j++)
        //   {
        //     if(arr[i]+arr[j]==k)
        //     {
        //         count++;
        //     }
        //   }
        // }
        // return count;   this line of code time complexity is O(N^2)  so need to optimize this code
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Store frequencies of elements in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Traverse the array and check for pairs
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            // If the current element is a potential pair itself,
            // decrement the count to avoid counting it twice
            if (complement == arr[i]) {
                count--;
            }
        }

        // Divide the count by 2 as each pair is counted twice
        return count / 2;
    }
    public static void main(String[] args) {
        countpairswithgivensum cg = new countpairswithgivensum();
        int [] arr = { 1,1,1,1};
        int n= arr.length;
        int ans=cg.getPairsCount(arr,n,2);
        System.out.println(ans);
    }
}
