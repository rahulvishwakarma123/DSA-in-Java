import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class KosarajuAlgorithm {
    public static void dfs(HashMap<Integer, List<Integer>> graph, boolean[] vis, Stack<Integer> st, int curr){
        vis[curr] = true;
        for(Integer v: graph.get(curr)){
            if(!vis[v]){
                dfs(graph, vis, st, v);
            }
        }
        st.push(curr);
    }
    public static void dfs2(HashMap<Integer, List<Integer>> graph, boolean[] vis, int curr){
        vis[curr] = true;
        for(Integer v: graph.get(curr)){
            if(!vis[v]){
                dfs2(graph, vis, v);
            }
        }
    }

    public static int findSccCount(int V, int[][] edges, int n){
        // make the graph
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= V; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
        }
        
        // 1st step : find the topological order in the original graph
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V+1];
        for (int i = 1; i <= V; i++) {
            if(!vis[i]){
                dfs(graph, vis, st, i);
            }
        }

        Arrays.fill(vis, false);


        // 2nd : reverse the graph
        graph.clear();
        for(int i = 1; i <= V; i++){
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge: edges) {
            int v = edge[0];
            int u = edge[1];
            graph.get(u).add(v);
        }

        // 3rd : traverse through all SCCs and count them
        int count = 0;
        while(!st.empty()){
            int curr = st.pop();
            if(!vis[curr]){
                dfs2(graph, vis, curr);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
            {1, 3},
            {1, 4},
            {2, 1},
            {3, 2},
            {4, 5}
        };
        int M = edges.length;

        // int[][] ans = findSCC(V, edges, M);
        // System.out.println("Strongly Connected Components are:");
        // for (int[] scc : ans) {
        //     for (int x : scc) {
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }

        int ans = findSccCount(V, edges, M);
        System.out.println(ans);
        
    }
}