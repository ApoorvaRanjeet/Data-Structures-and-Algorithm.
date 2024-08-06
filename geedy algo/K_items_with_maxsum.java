public class K_items_with_maxsum 
{
    public static int max_sum(int numOnes,int numZeros,int numNegOnes,int k)
    {
        int sum=0;
        while(k!=0)
        {
            if(numOnes>0)
            {
                while(numOnes!=0 && k!=0)
                {
                    sum+=1;
                    numOnes--;
                    k--;
                }
            }
            else if(numZeros!=0)
            {
                while(numZeros!=0 && k!=0)
                {
                    sum+=0;
                    numZeros--;
                    k--;
                }
            }
            else
            {
                while(numNegOnes!=0 && k!=0)
                {
                    sum+=-1;
                    numNegOnes--;
                    k--;
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int numOnes = 3;
        int numZeros = 2;
        int numNegOnes=0;
        int k=2;
        System.out.println(max_sum(numOnes, numZeros, numNegOnes, k));
    }
}
