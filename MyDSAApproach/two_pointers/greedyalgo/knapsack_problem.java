import java.util.*;
class Item
{
    int value,weight;
    double ratio;

    public Item(int value,int weight)
    {
        this.value=value;
        this.weight=weight;
        this.ratio=(double)value/weight;
    }
}
public class knapsack_problem
{
    public static double fractional(int[]value,int[] weight,int capacity)
    {
        int n=value.length;
        Item[] items= new Item[n];
        for(int i=0;i<n;i++)
        {
            items[i]=new Item(value[i],weight[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double maxvalue=0.0;
        int remaining=capacity;
        for(int i=0;i<n && remaining>0;i++)
        {
            if(items[i].weight<=remaining)
            {
                maxvalue+=items[i].value;
                remaining-=items[i].weight;
            }
            else
            {
                maxvalue+=items[i].ratio*remaining;
                remaining=0;
            }
        }
        return maxvalue;
    }
    public static void main(String[]args)
    {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        System.out.println(fractional(values,weights,capacity));
    }
}