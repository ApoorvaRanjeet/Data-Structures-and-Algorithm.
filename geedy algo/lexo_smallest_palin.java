public class lexo_smallest_palin 
{
    public static String solve(String s)
    {
        char[] ch= s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n/2;i++)
        {
            int j=n-1-i;
            char smaller=ch[i]<ch[j]?ch[i]:ch[j];
            ch[i]=smaller;
            ch[j]=smaller;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s="egcfe";
        System.out.println(solve(s));
    }
    
}
