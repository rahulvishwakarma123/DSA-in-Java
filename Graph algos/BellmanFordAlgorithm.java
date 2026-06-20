import java.util.*;

class BellmanFordAlgorithm{

    public static int[] bellmanFord(int V, int[][] edges, int src){
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e8);

        for (int i = 0; i < V; i++) {
            for(int[] edge: edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
    
                // relaxation step
                if(dist[u] != (int)1e8 && dist[v] < dist[u] + w){
                    // negative cycle found
                    if(i == V-1){
                        return new int[]{-1};
                    }

                    // relaxation
                    dist[v] = dist[u] + w;
                }
            }
        }

        return dist;
    }
    public static void main(String[] args) {
        
    // Number of vertices in the graph
    int V = 5;

    // Edge list representation: {source, destination, weight}
    int[][] edges = new int[][] {
        {1, 3, 2},    
        {4, 3, -1},   
        {2, 4, 1},    
        {1, 2, 1},    
        {0, 1, 5}     
    };

    // Source vertex for Bellman-Ford algorithm
    int src = 0;

    // Run Bellman-Ford algorithm from the source vertex
    int[] ans = bellmanFord(V, edges, src);

    // Print shortest distances from the source to all vertices
    for (int dist : ans) 
        System.out.print(dist + " ");
}
}