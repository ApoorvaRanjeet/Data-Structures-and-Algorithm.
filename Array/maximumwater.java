import java.util.Arrays;

public class maximumwater {
    // public int maxArea(int[] height) {
    //     int mid = height.length / 2;
    //     int l = 0;
    //     int r = 0;
    //     int left[] = new int[mid];
    //     // int right[] = new int[height.length - mid];
        
    //     // Copy elements to left array
    //     for (int i = 0; i < mid; i++) {
    //         left[i] = height[i];
    //     }
        
    //     // // Copy elements to right array
    //     // for (int i = mid; i < height.length; i++) {
    //     //     right[i - mid] = height[i]; //5, 4, 8, 3, 7
    //     // }
        
    //     int max = left[0]; // 1, 8, 6, 2
    //     int index=0;
    //     for (int i = 1; i < left.length; i++) 
    //     {
    //         if (left[i] > max) 
    //         {
    //             max = left[i];
    //             index=i;
    //         }
    //     }
            
        
    //     // Assign values to l and r
    //     l = index;
    //     r =height.length - 1;
        
    //     int length = r - l;
    //     int width = height[r];
    //     int area = length * width;
    //     return area;
    // }
    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
    
        while (l < r) {
          final int minHeight = Math.min(height[l], height[r]);
          ans = Math.max(ans, minHeight * (r - l));
          if (height[l] < height[r])
            ++l;
          else
            --r;
        }
    
        return ans;
      }

    public static void main(String[] args) {
        maximumwater in = new maximumwater();
        // int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 1};
        int ans = in.maxArea(height);
        System.out.println(ans);
    }
}
