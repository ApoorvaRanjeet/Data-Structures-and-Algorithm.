public class reversevowels 
{
    public static boolean isVowels(char c)
    {
        return (c == 'a' || c == 'A' || c == 'e'
				|| c == 'E' || c == 'i' || c == 'I'
				|| c == 'o' || c == 'O' || c == 'u'
				|| c == 'U');
    }
    public String reverseVowel(String s)
    {
        int left=0;
        int right=s.length()-1;
        char[] ch= s.toCharArray();
        while(left<right)
        {
            if(!isVowels(ch[left]))
            {
                left++;
                continue;
            }
            if(!isVowels(ch[right]))
            {
                right--;
                continue;
            }
            // Swap the characters
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            
            left++;
            right--;
        }
        String str = String.copyValueOf(ch);
        return str;
        }
        public static void main(String[] args) 
        {
            reversevowels in = new reversevowels();
            String s="hello";
            System.out.println("Reversed string: "+in.reverseVowel(s));
        }
            
        
    }

