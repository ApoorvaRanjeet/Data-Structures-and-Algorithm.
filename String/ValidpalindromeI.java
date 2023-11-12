public class ValidpalindromeI 
{
    public boolean palindrome(String s)
    {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        char[] ch = s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        String reversedString = new String(ch);
        if(reversedString.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        ValidpalindromeI vp =new ValidpalindromeI();
        boolean ans = vp.palindrome("hello world");
        System.out.println(ans);
    }
    
}
