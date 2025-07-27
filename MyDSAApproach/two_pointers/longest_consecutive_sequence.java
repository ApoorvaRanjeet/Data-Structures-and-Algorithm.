import java.util.*;
public class longest_consecutive_sequence
{
    public static int longest(int[]nums)
    {Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
    
        int maxLength = 0;
    
        for (int num : nums) {
            if (!set.contains(num - 1)) { // Start of a new sequence
                int currentNum = num;
                int count = 1;
    
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
    
                maxLength = Math.max(maxLength, count);
            }
        }
    
        return maxLength;
    }
    public static void main(String[]args)
    {
        int[]arr={0,3,4,1,2,8,7,5,6};
        System.out.print(longest(arr));
    }
}