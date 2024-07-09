public class Rearrange_Array_Element_By_Sign 
{
    public int[] rearrangeArray(int[] nums) {
        int[]result= new int[nums.length];
        int posindex=0;
        int negindex=1;
        for(int i:nums)
        {
            if(i>=0)
            {
                if(posindex<nums.length)
                {
                    result[posindex]=i;
                    posindex+=2;
                }
            }
            else
            {
                if(negindex<nums.length)
                {
                    result[negindex]=i;
                    negindex+=2;
                }
            }
        }
        return result;
}
    
}
