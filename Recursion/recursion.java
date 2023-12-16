public class recursion 
{
    public  void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(""+n);
        print(n-1);
    }
    public void reverseprint(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        reverseprint(n+1);
    }
    public void sum(int n,int t,int sum)
    {
        if(n==t)
        {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;
        sum(n+1,t,sum);
        
    }
    public void sumofeven(int i,int n,int sum) // parameters mein woahi value rakhte hain jo future update hote rehte hain
    {
        if(i>n)
        {
            System.out.println(sum);
            return;
        }
        if(i%2==0)
        {
            sum+=i;
        }
        
        sumofeven(i+1, n, sum);
    }
    public void sumofodd(int i,int n,int sum)
    {
        if(i>n)
        {
            System.out.println(sum);
            return;
        }
        if(i%2!=0)
        {
            sum+=i;
        }
        
        sumofodd(i+1, n, sum);
    }
    public void factorial(int i,int n,int fac)
    {
        if(i>n)
        {
            System.out.println(fac);
            return;
        }
        fac=fac*i;
        factorial(i+1,n,fac);
    }
    public void fibonacci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(" "+c);
        fibonacci(b, c, n-1);
        
    }
    public static void main(String[]args)
    {
        recursion in = new recursion();
        // in.print(5);
        // in.reverseprint(1);
        // in.sum(1, 5, 0);
        // in.sumofeven(1, 5, 0);
        // in.sumofodd(1, 5, 0);
        // in.factorial(1, 5, 1);
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        in.fibonacci(0, 1, n-2);
    }
    
}
