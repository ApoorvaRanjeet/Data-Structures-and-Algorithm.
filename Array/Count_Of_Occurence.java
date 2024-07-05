import java.util.*;
public class Count_Of_Occurence 
{
    public static int countOccurrence(int[] arr, int n, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        int threshold = n / k;

        int total = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > threshold) {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;
        System.out.println(countOccurrence(arr, n, k)); 
    }
    
    
}
