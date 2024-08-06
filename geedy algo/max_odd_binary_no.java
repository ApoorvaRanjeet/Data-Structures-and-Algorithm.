public class max_odd_binary_no 
{
    public static String solve(String s)
    {
        int countzeros=0;
        int countones=0;
        char[]ch = s.toCharArray();
        for(char c:ch)
        {
            if(c=='1')
            {
                countones++;
            }
            else
            {
                countzeros++;
            }
        }
        StringBuilder result= new StringBuilder();
        for(int i=0;i<countones-1;i++)
        {
            result.append('1');
        }
        for(int i=0;i<countzeros;i++)
        {
            result.append('0');
        }
        result.append('1'); // odd banane ke liye
        return result.toString();

    }
    public static void main(String[] args) {
        String s="0011";
        System.out.println(solve(s));
    }
    
}
