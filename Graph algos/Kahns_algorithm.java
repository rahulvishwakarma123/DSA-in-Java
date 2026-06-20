import java.util.*;
import java.util.List;

public class Kahns_algorithm {
        // topological sort using kahn's algorithm
        public ArrayList<Integer> topoSort(int V, int[][] edges) {
            // code here
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];

                graph.get(u).add(v);
            }

            int[] indegree = new int[V];
            //step 1 : populatingg thee indegree array
            for (int u = 0; u < V; u++) {
                for (Integer v : graph.get(u)) {
                    indegree[v]++;
                }
            }

            Queue<Integer> q = new java.util.LinkedList<>();
            //step 2: adding the element to the queue with 0 indegree
            for (int i = 0; i < V; i++) {
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }

            ArrayList<Integer> res = new ArrayList<>();
            // step 3: apply siple bfs
            while (!q.isEmpty()) {
                // 3a : add elements to the res when removing from the queue
                int curr = q.remove();
                res.add(curr);
                for (int neigh : graph.get(curr)) {
                    // 3b: decrease the indegree of the neighbours and when it become 0 add it to the queue
                    indegree[neigh]--;

                    if (indegree[neigh] == 0) {
                        q.add(neigh);
                    }
                }
            }

            return res;

        }
}
