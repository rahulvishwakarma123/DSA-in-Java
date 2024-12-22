public class ShortestPath {

    public static int shortestPath(String path){
        int pathLength = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            }
        }
        pathLength = (int)Math.sqrt(x*x + y*y);
        return pathLength;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path = " + shortestPath(path));
    }
}
