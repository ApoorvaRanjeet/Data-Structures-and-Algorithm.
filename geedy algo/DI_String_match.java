public class DI_String_match 
{
    public static int[] match(String s)
    {
        int n=s.length();
        int[]result= new int[n+1];
        int low=0;
        int high=n;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='I')
            {
                result[i]=low++;
            }
            else{
                result[i]=high--;
            }
        }
        result[n]=low;
        return result;
    }
    public static void main(String[] args) {
        String s="IDID";
        int[] result=match(s);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}
