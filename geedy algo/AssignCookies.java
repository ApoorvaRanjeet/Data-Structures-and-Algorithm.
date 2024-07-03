import java.util.*;
public class AssignCookies 
{
    public static void main(String[] args) {
        int g[]={1,2,3};
        int[]s={1,1};
        System.out.println(cookies(g, s));

    }
    public static int cookies(int[]g , int[]s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int r=0,l=0;
        int n=g.length;
        int m=s.length;
        while(l<m && r<n)
        {
            if(g[r]<=s[l])
            {
                r++;
            }
            l++;
        }
        return r;
    }
    
}
