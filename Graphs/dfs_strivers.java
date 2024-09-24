import java.util.*;
public class dfs_strivers 
{
    public ArrayList<Integer> dfsofgraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis= new boolean[V+1];
        ArrayList<Integer> ls= new ArrayList<>();
        vis[0]=true;
        dfs(0,vis,adj,ls);
        return ls;
    }
    private void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ls)
    {
        vis[node]=true;
        ls.add(node);
        for(Integer it: adj.get(node))
        {
            if(vis[it]==false)
            {
                dfs(it, vis, adj, ls);
            }
        }
    }
}
