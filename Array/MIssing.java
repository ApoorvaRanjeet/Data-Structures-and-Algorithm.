public class MIssing 
{
    public static int miss(int[]nums)
    {
        int n = nums.length + 1;  
        int sum = n * (n + 1) / 2;  
        int s2 = 0;
        for (int i = 0; i < nums.length; i++) {
            s2 += nums[i];
        }
        return sum - s2;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,6};
        int ans=miss(nums);
        System.out.println(ans);
    }
}
