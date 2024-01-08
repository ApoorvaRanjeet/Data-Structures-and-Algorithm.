public class plusone 
{
    public int[] plus(int[] digits)
    {
        int[]arr  = new int[digits.length];
        for (int i=0;i<digits.length;i++)
        {
            arr[i]=digits[i];
            if(i==digits.length-1)
            {
                arr[i]=digits[i]+1;
            }
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        plusone in = new plusone();
        int[] digits = {9};
        int[]arr=new int[digits.length];
        arr=in.plus(digits);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
