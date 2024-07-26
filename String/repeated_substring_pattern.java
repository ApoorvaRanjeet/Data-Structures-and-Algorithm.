public class repeated_substring_pattern 
{
    public static boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String t=doubled.substring(1,doubled.length()-1);
        return t.contains(s);
    }
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
