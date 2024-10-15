
public class max_nesting_depth_paranthese 
{
    public int maxdepth(String s)
    {
        int max=0;
        int curr=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                curr++;
                max=Math.max(max,curr);
            }
            else if(c==')')
            {
                curr--;
            }
        }
        return max;
    }
    
}
