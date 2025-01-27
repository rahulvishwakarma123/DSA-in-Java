import java.util.ArrayList;

public class HasPath {

        // Blue print of the edge.
        static class Edge{
            int src;
            int dest;
            int wt;
            public Edge(int source, int destination, int weight){
                this.dest = destination;
                this.src = source;
                this.wt = weight;
            }    
        }
    
        public static boolean hasPath(ArrayList<Edge>[] graph, int source , int destination, boolean[] vis){    //O(V+E)
            if (source == destination) {
                return true;
            }
            vis[source] = true;

            for (int i = 0; i < graph[source].size(); i++) {
                Edge e = graph[source].get(i);
                if (!vis[e.dest] && hasPath(graph, e.dest, destination, vis)) {
                    return true;
                }
            }
            return false;
        }
        
        public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        
        graph[6].add(new Edge(6, 5, 1));

        boolean ans = hasPath(graph, 0, 8, new boolean[graph.length]);
        System.out.println(ans);
        
    }
}

