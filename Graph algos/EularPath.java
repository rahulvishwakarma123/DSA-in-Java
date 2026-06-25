class EularPath {
    
    public void dfs(int u, boolean[] vis, int[][] graph){
        vis[u] = true;
        for(int v: graph[u]){
            if(!vis[v]){
                dfs(v, vis, graph);
            }      
        }
    }
    
    public boolean isConnected(int V, int[][] adj, int u, boolean[] vis){
        
        dfs(u, vis, adj);
        
        for(int i = 0; i < V; i++){
            if(!vis[i] && adj[i].length > 0){
                return false;
            }
        }
        
        return true;
        
    }
    
    public int isEulerCircuit(int V, int[][] adj) {
        // code here
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(adj[i].length > 0){
                if(!isConnected(V, adj, i, vis)){
                    return 0;
                }
                break;
            }
        }
        int oddDegree = 0;
        for(int i = 0; i < V; i++){
            if(adj[i].length % 2 != 0){
                oddDegree++;
            }
        }
        
        
        if(oddDegree == 0){
            return 2;
        }else if(oddDegree == 2){
            return 1;
        }else return 0;
        
    }
}