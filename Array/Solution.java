class Solution
{
    public int searchInsert(int[] nums, int target)
    {
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>=target)
        {
            return i;
        }
     }
     return nums.length;
    }
    public static void main(String[]args)
    {
        int[]nums = {2,3,4,7};
        Solution in = new Solution();
        System.out.println(in.searchInsert(nums, 5));
    }
}