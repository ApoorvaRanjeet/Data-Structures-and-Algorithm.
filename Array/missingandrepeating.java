import java.util.HashMap;
public class missingandrepeating 
{
    // int findTwoElement(int arr[], int n) 
    // {
    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    int repeating=0;
    //    int missing=0;
    //    for(int i=0;i<n;i++)
    //    {
    //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    //    }
    //    for(int i=0;i<n;i++)
    //    {
    //     if(map.containsKey(arr[i]))
    //     {
    //         return map.get(arr[i]);
    //     }
    //    }
    //    return -1;
    // }
    int[] findTwoElement(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int repeating = -1;
        int missing = -1;

        // Find repeating and missing elements simultaneously
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (arr[num - 1] > 0) {
                arr[num - 1] *= -1; // Mark the element as negative to indicate it's been visited
            } else {
                repeating = num;
            }
            map.put(num, i); // Store the element's index in the map
        }

        // Find the missing element
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        missingandrepeating mr = new missingandrepeating();
        int[] arr= {1,2,4};
        int n= 4;
        int[] ans = new int[2];
        ans = mr.findTwoElement(arr,n);
        System.out.println(ans);
    }
}
