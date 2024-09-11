import java.util.*;
public class subarrays_with_given_XOR_K 
{
    public static int subarrays(int[]arr,int k,int n)
    {
        int xr=0;
        int cnt=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(xr,1);
        for(int i=0;i<n;i++)
        {
            xr=xr^arr[i];
            int x=xr^k;
            if(map.containsKey(x))
            {
                cnt+=map.get(x);
            }
            if(map.containsKey(xr))
            {
                map.put(xr,map.get(xr)+1);
            }
            else
            {
                map.put(xr,1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={4,2,2,6,4};
        int k=6;
        int n=arr.length;
        System.out.println(subarrays(arr, k, n));
    }
}
