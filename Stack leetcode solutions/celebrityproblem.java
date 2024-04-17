import java.util.Stack;
public class celebrityproblem 
{
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> s = new Stack<>();
        //step 1 push all elements in the stack
        for(int i=0;i<n;i++)
        {
            s.push(i);
        }
        // step 2 
        while(s.size()!=1)
        {
            int a=s.peek();
            s.pop();
            int b=s.peek();
            s.pop();
            if(knows(a,b,M,n))
            {
                s.push(b);
            }
            else
            {
                s.push(a);
            }
        }
        // step 3 single element in stack is a potential celebrity
        // so verify it
        int candidate=s.peek();
        boolean rowcheck=false;
        int zerocount=0;
        for(int i=0;i<n;i++)
        {
            if(M[candidate][i]==0)
            {
               zerocount++;
            }
        }
        if(zerocount==n)
        {
            rowcheck=true;
        }
        //column check
        boolean columcheck=false;
        int coulmcount=0;
        for(int i=0;i<n;i++)
        {
            if(M[candidate][i]==1)
            {
                coulmcount++;
            }
        }
        if(coulmcount==n-1)
        {
            columcheck=true;
        }
        if(rowcheck==true && columcheck==true)
        {
            return candidate;
        }
        return -1;
    }
    private boolean knows(int a,int b,int M[][], int n)
    {
        if(M[a][b]==1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
