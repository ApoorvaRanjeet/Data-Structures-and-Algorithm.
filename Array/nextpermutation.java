import java.util.*;
public class nextpermutation 
{
    public List<Integer> next(int[] arr,int n)
    {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(arr[i]);
        }
        int ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a.get(i)<a.get(i+1))
            {
                ind=i;
                break;
            }
        }
        if(ind == -1)
        {
            Collections.reverse(a);
            return a;
        }
        for(int i=n-1;i>ind;i--)
        {
            if (a.get(i) > a.get(ind)) {
                int tmp = a.get(i);
                a.set(i, a.get(ind));
                a.set(ind, tmp);
                break;
            }
        }
        List<Integer> s = a.subList(ind + 1, n);
        Collections.reverse(s);

        return a;
    }
    public static void main(String args[]) {
        nextpermutation in =new nextpermutation();
        int[] A ={2, 1, 5, 4, 3, 0, 0};
        int n=7;
        List<Integer> ans = in.next(A,n);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
