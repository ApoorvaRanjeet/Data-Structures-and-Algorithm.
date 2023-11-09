import java.util.Arrays;
import java.util.ArrayList;
public class reversestring 
{
    public void reverseString(char[] s)
    {
        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(s));
    }
    public static void main(String[]args)
    {
        reversestring in = new reversestring();
        char[] s={'h','e','l','l','o'};
        in.reverseString(s);
    }
    }
    

