public class Can_Place_Flowers 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int count=0;
        int l=flowerbed.length;
        for(int i=0;i<l;i++)
        {
            if(flowerbed[i]==0 &&
            (i==0||flowerbed[i-1]==0) &&
            (i==l-1||flowerbed[i+1]==0))
            {
                flowerbed[i]=1;
                count++;
                i++;
            }
            if(count>=n)
            {
                return true;
            }
        }
        return count>=n;
    }
   
}
