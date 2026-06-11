import java.util.*;
import java.util.LinkedList;

public class CycleDetectionUsingKahns {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // step 1 : populating the indegree while constructing the graph
        int[] indegree = new int[V];
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            indegree[v]++;
        }

        int count = 0;
        // step 2: add the elements with 0 indegree to the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(indegree[i] == 0){
                q.add(i);
                count++;
            }
        }

        while(!q.isEmpty()){
            int u = q.remove();
            for(int v: graph.get(u)){
                indegree[v]--;
                if(indegree[v] == 0) {
                    q.add(v);
                    count++;
                }
            }
        }
        
        if (count == V) { // all nodes are visited, means no cycle exists
            return false;
        }
        // otherwise cycle eexists
        return true;
    }
}
