import java.util.*;

public class CycleDetection {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.dest = d;
            this.src = s;   
        }
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph,vis,i,-1)) {
                    return true;
                };
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                //case 3:
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            //case 2:
            else if (vis[e.dest] && e.dest != parent) {
                return true;
            } 
            // case 3: Do nothing or continue;
    }
        return false;
    }
    public static void main(String[] args) {   // O(V+E)
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1)); 
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));

        System.out.println("Graph created with a cycle.");

        if (detectCycle(graph)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
        
    }
    
}