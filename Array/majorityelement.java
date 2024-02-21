import java.util.HashMap;
import java.util.Map;

public class majorityelement 
{
    public int majorityElement(int a[], int size)
    {
        // [{3,1,3,3,2] // 1 2 3 3 3
            int n = a.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(a[i], 0);
            mpp.put(a[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
      majorityelement in = new majorityelement();
      int arr[] = {2, 2, 1, 1, 1, 2, 2};
      int result = in.majorityElement(arr, arr.length);
      System.out.println(result);
    }
}
