public class Knapsack0to1 {
    public static void main(String[] args) {
        int[] val = { 15, 14, 10, 45, 30 };
        int[] wt = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(knapsack(val, wt, W, val.length));
    }

    static int knapsack(int[] val, int[] wt, int W, int n) {

        // base case
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {  // valid case
           
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } else {
            // invalid case
            return knapsack(val, wt, W, n - 1);
        }
    }
}
