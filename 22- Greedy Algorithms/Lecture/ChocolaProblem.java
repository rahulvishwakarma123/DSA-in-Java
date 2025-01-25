import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer vCost[] = {2,1,3,1,4};  // m-1
        Integer hCost[] = {4,1,2};      // n-1
        int n = 4, m = 6;

        Arrays.sort(vCost, Collections.reverseOrder());
        Arrays.sort(hCost, Collections.reverseOrder());

        int hPointer = 0;
        int vPointer = 0;
        int hPieces = 1;
        int vPieces = 1;
        int cost = 0;

        while(hPointer < hCost.length && vPointer < vCost.length){
            //vertical cost < horizontal cost
            if (vCost[vPointer] <= hCost[hPointer]) { //horizontal cut
                cost += (hCost[hPointer] * vPieces);
                hPointer++;
                hPieces++;
            }else{  // vertical cut
                cost += (vCost[vPointer] * hPieces);
                vPointer++;
                vPieces++;
            }
        }

        // left horizontal cuts
        while (hPointer < hCost.length) {
            cost += (hCost[hPointer] * vPieces);
            hPieces++;
            hPointer++;
        }

        // left vertical cuts
        while (vPointer < vCost.length) {
            cost += (vCost[vPointer] * hPieces);
            vPieces++;
            vPointer++;
        }

        System.out.println("Final cost is = " + cost);
        System.out.println("Total peices = "  + (hPieces + vPieces ));
        
    }
}
