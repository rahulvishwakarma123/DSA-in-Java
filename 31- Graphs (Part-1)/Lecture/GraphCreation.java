import java.util.*;

public class GraphCreation {
    static class Graph{
        int src;
        int dest;
        int wt;

        public Graph(int source, int destination, int weight){
            this.src = source;
            this.dest = destination;
            this.wt = weight;
        }
    }
    
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Graph> graph[] = new ArrayList[vertex];

        // initialing the ArrayLists of the graph.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex 0
        graph[0].add(new Graph(0, 1, 5) );
        
        // vertex 1
        graph[1].add(new Graph(1, 0, 5) );
        graph[1].add(new Graph(1, 2, 1) );
        graph[1].add(new Graph(1, 3, 3) );
        
        // vertex 2
        graph[2].add(new Graph(2,1,1));
        graph[2].add(new Graph(2,3,1));
        graph[2].add(new Graph(2,4,2));

        //vertex 3
        graph[3].add(new Graph(3,1,3));
        graph[3].add(new Graph(3,2,1));

        // vertex 4
        graph[4].add(new Graph(4,2,2));

        // neighbours of 2
        for (int i = 0; i < graph[2].size(); i++) {
            Graph e = graph[2].get(i);
            System.out.print(e.dest + " ");

        }
    }
}