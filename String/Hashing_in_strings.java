public class Hashing_in_strings 
{
    public int brute(String text,String pat)
    {
        for(int i=0;i<text.length();i++)
        {
            for(int j=i+1;j<=text.length();j++)
            {
                String s=text.substring(i,j);
                if(s.equals(pat))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public int optimal(String text,String pat)
    {
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++)
        { 
            int j=0;
            while(j<m && text.charAt(i+j)==pat.charAt(j))
            {
                j++;
            }
            if(j==m)
            {
                return i;
            }
        }
        return -1;
    }
}
