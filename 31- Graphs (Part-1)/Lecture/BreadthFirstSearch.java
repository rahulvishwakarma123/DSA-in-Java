import java.util.*;

public class BreadthFirstSearch {
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

    public static void bfs(ArrayList<Edge> graph[]){    // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        q.add(0); // source = 0

        while(!q.isEmpty()){
            int curr = q.remove();

            if (!vis[curr]) { // mark visited
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }

    // finding path using bfs  
    public static boolean findPath(ArrayList<Edge>[] graph, int source, int dest){
        if(source == dest) return true;
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Boolean> hm = new HashMap<>();
        q.add(source);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!hm.containsKey(curr)){
                hm.put(curr, true);
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if(e.dest == dest) return true;
                    q.add(e.dest);
                }
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

        bfs(graph);
        boolean res = findPath(graph, 0, 6);
        System.out.println(res);
        
    }
}
