import java.util.*;

public class ConnectedComponents{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.dest = d;
            this.src = s;
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                bfsUtil(graph,visited,i);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean[] visited,int start){
        Queue<Integer>  q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }


    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph,i,visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph,int curr, boolean[] visited){
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }
    

    public static void main(String[] args) {
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Component 1
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        // Component 2
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

        dfs(graph);
        System.out.println();
        
        bfs(graph);
    }
}