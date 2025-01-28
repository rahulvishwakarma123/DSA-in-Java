import java.util.ArrayList;

class Edge {
    int src, dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class DirectedGraphCycleDetection {

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        boolean[] recStack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] recStack) {
        vis[curr] = true;
        recStack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (recStack[e.dest]) {    // cycle exists
                return true;
            } else if (!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, recStack)) {
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
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

        System.out.println("Graph created.");

        if (detectCycle(graph)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }
}