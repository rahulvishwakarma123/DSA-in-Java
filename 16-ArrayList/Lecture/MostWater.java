import java.util.ArrayList;

public interface MostWater {

    // This is the brute force approach.
    // TC = O(n^2)
    public static int storeWaterBF(ArrayList<Integer> height){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int boundry = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWater = boundry * width;
                max = Math.max(max,currWater);
            }
        }

        return max;
    }
    
    //this is the optimized approach for the container with most water.
    //this is the two pointer approach.
    // TC = O(n)
    public static int storeWaterOS(ArrayList<Integer> height){
        int max = 0;
        int rp = height.size() - 1;
        int lp = 0;
        while (lp<rp) {

            int boundry = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = boundry * width;
            max = Math.max(currWater, max);

            if (lp<rp) {
                lp++;
            }else{
                rp--;
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println(storeWaterOS(height));
        
    }
}
