import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[values.length][2];
        //0th col => idx , 1st col => ratio

        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i]/(double)weights[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;

    }
}
