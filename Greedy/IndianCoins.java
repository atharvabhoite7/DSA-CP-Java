import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int target = 590;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= target) {
                while (coins[i] <= target) {
                    target -= coins[i];
                    count++;
                    list.add(coins[i]);
                }
            }
        }

        System.out.println("Number of coins required: " + count);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
