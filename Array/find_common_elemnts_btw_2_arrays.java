import java.util.HashSet;

public class find_common_elemnts_btw_2_arrays 
{
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
       
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        int[] ans = new int[2];
        int count = 0;
        int count1 = 0;
        
     
        for (int num : nums1) {
            set1.add(num);
        }
        
    
        for (int num : nums2) {
            set2.add(num);
        }
      
        for (int num : nums1) {
            if (set2.contains(num)) {
                count++;
            }
        }
        
    
        for (int num : nums2) {
            if (set1.contains(num)) {
                count1++;
            }
        }
        
    
        ans[0] = count;
        ans[1] = count1;

        return ans;
    }

    public static void main(String[] args) {
       

        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};
        int[] result = findIntersectionValues(nums1, nums2);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Expected output: [2, 1]

        int[] nums1_2 = {4, 3, 2, 3, 1};
        int[] nums2_2 = {2, 2, 5, 2, 3, 6};
        int[] result2 = findIntersectionValues(nums1_2, nums2_2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Expected output: [3, 4]

        int[] nums1_3 = {3, 4, 2, 3};
        int[] nums2_3 = {1, 5};
        int[] result3 = findIntersectionValues(nums1_3, nums2_3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // Expected output: [0, 0]
    }
    
}
