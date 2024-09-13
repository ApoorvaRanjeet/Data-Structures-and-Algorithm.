import java.util.*;
public class count_inversion_using_mergesort 
{
    public int inversions(int[]arr)
    {
        return mergesort(arr,0,arr.length-1);
    }
    private int mergesort(int[]arr,int low,int high)
    {
        int cnt=0;
        if(low>=high)
        {
            return cnt;
        }
        int mid=(low+high)/2;
        cnt+=mergesort(arr,low,mid);
        cnt+=mergesort(arr, mid+1, high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }
    private int merge(int[]arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp= new ArrayList<>();
        int cnt=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
        }
        else
        {
            temp.add(arr[right]);
            right++;
            cnt+=(mid-left+1);
        }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
        }
        while(right<=high)
        {
            temp.add(arr[right]);
        }
    for(int i=low;i<=high;i++)
    {
        arr[i]=temp.get(i-low);
    }
    return cnt;
}
}
