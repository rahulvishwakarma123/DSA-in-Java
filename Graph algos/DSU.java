public class DSU {

    // find function by path compression
    public static int find(int x, int[] par){
        if(x == par[x]){
            return x;
        }
        par[x] = find(par[x], par);
        return par[x];
    }

    // union function by rank
    public static void unionByRank(int x, int y, int[] rank, int[] par){
        // parents of x and y
        int px = find(x, par); 
        int py = find(y, par);
        if(px == py){
            return;
        }

        if(rank[px] > rank[py]){
            par[py] = px;
        }else if(rank[px] < rank[py]){
            par[px] = py;
        }else{
            par[py] = px;
            rank[px]++;
        }
    }

    public static void unionBySize(int x, int y, int[] size, int[] par){
        // parents of x and y
        int px = find(x, par); 
        int py = find(y, par);
        if(px == py){
            return;
        }

        if(size[px] > size[py]){
            par[py] = px;
            size[px] += size[py];
        }else{
            par[px] = py;
            size[py] += size[px];
        }
    }
}
