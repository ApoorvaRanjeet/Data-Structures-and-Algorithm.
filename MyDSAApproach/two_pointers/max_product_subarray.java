public class max_product_subarray
{
    public static int maxproduct(int[]nums)
    {
        int currMax=nums[0];
        int globalMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int num=nums[i];
            int temp=currMax;

            currMax=Math.max(num,Math.max(num*currMax,num*currMin));
            currMin=Math.min(num,Math.min(num*currMin,num*temp));

            globalMax=Math.max(currMax,globalMax);
        }
        return globalMax;
    }
    public static void main(String[]args)
    {
        int[]nums={2,-5,-2,-4,3};
        System.out.print(maxproduct(nums));
    }
    // humlog current minimum number ka bhi track rakh rhe hain kyunki product mein koi sureity hi hai ki next multiplication mein max wala ya min walamaximum product dede kyunki kabhi kabhi mi wala maximum product de deta hai 
    // isliye currMax compute krte time humlog check krenge ki kaun sa max product de rha hai
}