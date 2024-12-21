public class TrappingRainwater {
    public static int trappingWater(int arr[]){
        int n = arr.length;
        
        // calculating the left max boundry
        int lMax[] = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }

        // calculating the right max boundry
        int rMax[] = new int[n];
        rMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }

        int TrappedRainwater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //water level
            int waterL = Math.min(lMax[i], rMax[i]);
            
            //trapped water 

            TrappedRainwater += waterL - arr[i];
        }
        return TrappedRainwater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.print("your trapped rainwater is:");
        System.out.println(trappingWater(arr));
        
    }
}
