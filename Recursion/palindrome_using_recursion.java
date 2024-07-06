public class palindrome_using_recursion 
{
    public static void main(String[] args) 
    {
        String s="MADAM";
        boolean ans=isPalindrome(s, 0);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s,int i)
    {
        if(i>=s.length())
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
        return isPalindrome(s, i+1);
    }
    
}
