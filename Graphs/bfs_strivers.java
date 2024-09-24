import java.util.*;
public class bfs_strivers
{
    public ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>>adj)
    {
        boolean[] vis= new boolean[V];
        ArrayList<Integer> ls= new ArrayList<>();
        vis[0]=true;
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            Integer curr=q.poll();
            ls.add(curr);
            for(Integer it:adj.get(curr))
            {
                if(vis[it]==false)
                {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return ls;
    }
    
}
