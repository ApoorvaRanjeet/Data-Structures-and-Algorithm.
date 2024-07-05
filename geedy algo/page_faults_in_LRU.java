import java.util.*;
public class page_faults_in_LRU 
{
   public static int pagefaults(int[]pages,int N,int C)
   {
      Set<Integer> pageset= new HashSet<>();
      Deque<Integer> memory = new LinkedList<>();
      int pf=0;
      for(int page : pages)
      {
        if(!pageset.contains(page))
        {
            pf++;
            if(memory.size()==C)
            {
                int lru= memory.removeLast();
                pageset.remove(lru);
            }
        }
        else
        {
            memory.remove(page);
        }
        memory.addFirst(page);
        pageset.add(page);
      }
return pf;
   }
   public static void main(String[] args) {
    int[] pages={5, 0, 1, 3, 2, 4, 1, 0, 5};
    int n= pages.length;
    int C=4;
    System.out.println("Page Faults in LRU: "+pagefaults(pages,n,C));
   } 
}
