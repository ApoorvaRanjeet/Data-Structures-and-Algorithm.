public class buy_and_sell_stock {
    public int buy(int[]prices)
    {
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            else
            {
                maxprofit=Math.max(maxprofit,prices[i]-minprice);
            }
        }
        return maxprofit;
    }
}