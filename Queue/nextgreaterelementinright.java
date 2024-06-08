public class nextgreaterelementinright 
{
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) 
  {
      int[] result= new int[queries];
      for(int i=0;i<queries;i++)
      {
          int idx=indices[i];
          int count=0;
          for(int j=idx+1;j<N;j++)
          {
              if(arr[j]>arr[idx])
              {
                  count++;
              }
          }
          result[i]=count;
      }
      return result;
     
  }
    
}
