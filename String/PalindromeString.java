public class PalindromeString 
{
    int isPalindrome(String S) {
        StringBuilder c= new StringBuilder();
        for(int i=S.length()-1;i>=0;i--)
        {
            c.append(S.charAt(i));
        }
        String result= c.toString();
        if(result.equals(S))
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        PalindromeString in = new PalindromeString();
        String S = "a";
        int ans = in.isPalindrome(S);
        System.out.println(ans);
    }
    
}
