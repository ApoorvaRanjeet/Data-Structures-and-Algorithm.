import java.util.Arrays;
public class leetcode1 {
  static int ans[];

  public int[] getConcatenation(int[] nums) {
    ans = new int[nums.length * 2];
    for (int i = 0; i<i+1; i++) 
    {
        for(int j=0;j<nums.length;j++)
        {
            ans[j] = nums[j];
        }
        for(int j=0;j<nums.length;j++)
        {
            ans[j+nums.length] = nums[j];
        }
    }

    return ans;
  }

  public static void main(String[] args) {
    leetcode1 in = new leetcode1();
    int []a={1};
    System.out.println(Arrays.toString(in.getConcatenation(a)));

    // for (int i = 0; i < ans.length; i++) {
    //   System.out.println(ans[i]);
    // }
    
  }
}