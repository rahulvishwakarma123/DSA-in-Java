public class FloodFillAlgo {

    public static void helper(int image[][] , int sr, int sc, int cl, boolean[][] vis, int orgColor){
        int n= image.length;
        int m = image[0].length;
        if (sr < 0 || sc < 0 || sr >= n || sc >= m ||
             vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }
        image[sr][sc] = cl;
        // left
        helper(image, sr, sc-1, cl, vis, orgColor);
        // right
        helper(image, sr, sc+1, cl, vis, orgColor);
        // top
        helper(image, sr-1, sc, cl, vis, orgColor);
        // down
        helper(image, sr+1, sc, cl, vis, orgColor);
       

    }

    public static int[][] floodFill(int image[][] , int sr, int sc, int color){
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};

        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(image, sr, sc, color);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]+ " ");
            }
            System.out.println();            
        }


    }
}
