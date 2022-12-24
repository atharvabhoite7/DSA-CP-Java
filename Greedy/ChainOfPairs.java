// Return Max length of chain of pairs
import java.util.*;

public class ChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int max = 1;

        int lastPair=pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] >= lastPair){
                max++;
                lastPair=pairs[i][1];
            }
        }

        System.out.println("Max length of chain of pairs: " + max);

    }
}
