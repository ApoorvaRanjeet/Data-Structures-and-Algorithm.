public class split_with_max_sum
{
    public static int sum(int num)
    {
        String str= Integer.toString(num);
        int[]digits= new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            digits[i]=str.charAt(i)-'0';
        }
        StringBuilder num1= new StringBuilder();
        StringBuilder num2= new StringBuilder();
        for(int i=0;i<digits.length;i++)
        {
            if(i%2==0)
            {
                num1.append(digits[i]);
            }
            else
            {
                num2.append(digits[i]);
            }
        }
        int n1=Integer.parseInt(num1.toString());
        int n2=Integer.parseInt(num2.toString());
        return n1+n2;
    }
    public static void main(String[] args) {
        int num=687;
        System.out.println(sum(num));
    }
}