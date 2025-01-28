import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteDetection {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.dest = d;
            this.src = s;
        }
    }

    // TC = O(V+E)
    // SC = O(V)
    public static boolean isBipartite(ArrayList<Edge>[] graph) {    
        int[] color = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            color[i] = -1; // No color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0; // yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(i);
                        // If neighbour has no color
                        if (color[e.dest] == -1) {
                            color[e.dest] = color[curr] == 0 ? 1 : 0;
                            q.add(e.dest);
                        }
                        // if neighbour has same color
                        else if (color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Acyclic Graph -> Return True
        // EvenCyclic Graph -> Return True
        // OddCyclic Graph -> Return False

        // This is Odd Cyclic graph.
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 0));

        if (isBipartite(graph)) {
            System.out.println("Graph is bipartite.");
        } else {
            System.out.println("Graph is non-bipartite.");

        }
    }
}
