import java.util.Arrays;
import java.util.Comparator;

public class MaxLenthOfChain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,60}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int ChainLen = 1;
        int LastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > LastEnd) {
                ChainLen++;
                LastEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum chain length = " + ChainLen);
        
    }
}
