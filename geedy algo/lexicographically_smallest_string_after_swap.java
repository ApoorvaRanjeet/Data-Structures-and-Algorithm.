public class lexicographically_smallest_string_after_swap 
{
    public static String solve(String s)
    {
        char[] c= s.toCharArray();
        int sum=1;
        for(int i=0;i<c.length-1;i++)
        {
            int d1=c[i]-'0';
            int d2=c[i+1]-'0';
            if(d1%2==d2%2 && d1>d2)
            {
                if(sum==1)
                {
                    char temp= c[i];
                    c[i]=c[i+1];
                    c[i+1]=temp;
                }
                sum--;
            }
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s="45320";
        System.out.println(solve(s));
    }
}
