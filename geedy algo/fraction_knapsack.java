import java.util.*;
class Item
{
    int value;int weight;

    public Item(int value,int weight)
    {
        this.value=value;
        this.weight=weight;
    }
}
public class fraction_knapsack 
{
    public double fractional(List<Integer>val,List<Integer>wt,int capacity)
    {
        int n=val.size();
        Item items[]= new Item[n];
        for(int i=0;i<n;i++)
        {
            items[i]=new Item(val.get(i),wt.get(i));
        }
        double maxvalue=0.0;

        Arrays.sort(items,(a,b)->Double.compare((double)b.value/b.weight,(double)a.value/a.weight));

        for(Item item:items)
        {
            if(capacity>0)
            {
                if(capacity>=item.weight)
                {
                    maxvalue+=item.value;
                    capacity-=item.weight;
                }
                else
                {
                    maxvalue+=(double)item.value*((double)capacity/item.weight);
                    capacity=0;
                }
            }
            else
            {
                break;
            }
        }
        return Math.round(maxvalue*1000000.0)/1000000.0;
    }
}
