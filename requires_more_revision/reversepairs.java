import java.util.*;
public class reversepairs 
{
    public int reverse(int[]arr,int n)
    {
        return mergesort(arr,0,n-1);
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
        cnt+=mergesort(arr,mid+1,high);
        cnt+=countpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    private void merge(int[]arr,int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp= new ArrayList<>();
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[high])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    }

private int countpairs(int[]arr,int low,int mid,int high)
{
    int cnt=0;
    int right=mid+1;
    for(int i=low;i<=mid;i++)
    {
        while(right<=high && arr[i]>=2L*arr[right])
        {
            right++;
            cnt+=right-(mid+1);
        }
    }
    return cnt;
}
}
