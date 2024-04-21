import java.util.ArrayList;
public class allpathsfromsourcetotarget 
{ 
  static class Edge
    {
        int src;
        int dest;

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void printallpaths(ArrayList<Edge> graph[], boolean[] vis, int curr, String path, int target) {
        if (curr == target) {
            System.out.println(path);
            return;
        }
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true; // Mark current vertex as visited
                printallpaths(graph, vis, e.dest, path + e.dest, target); // Concatenate e.src to path
                vis[e.dest] = false; // Backtrack: Mark the current vertex as unvisited
            }
        }
    }
    
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]= new ArrayList[v];
        
        creategraph(graph);
        // for(int i=0;i<v;i++)
        // {
        //      if(vis[i]==false)
        //      {
        //         dfs(graph,i,vis);     // this line of code is for the condition when the graph edges are not completely connected to each other meaning there are sub graphs 
        //      }
        // }
        int src=0;
        int targ=5;
        printallpaths(graph,new boolean[v],src,"0",targ);
    }
}