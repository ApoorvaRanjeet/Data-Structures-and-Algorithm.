public class max_consecutive_ones_III {
    public int longestones(int[]nums,int k)
    {
        int n=nums.length;
        int left=0,right=0,maxlen=0,zerocount=0;
        while(right<n)
        {
            if(nums[right]==0)
            {
                zerocount++;
            }
            while(zerocount>k)
            {
                if(nums[left]==0)
                {
                    zerocount--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}
