import java.util.*;
public class three_sum {
    public static List<List<Integer>> sum(int[]arr)
    {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            if(i>0 &&arr[i-1]==arr[i])
            {
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[left]+arr[right]+arr[i];
                if(sum==0)
                {
                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while(left<right && arr[left]==arr[left+1])
                    {
                        left++;
                    }
                    while(left<right && arr[right]==arr[right-1])
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[]arr={-1,0,1,2,-1,-4};
        System.out.println(sum(arr));
    }
}
