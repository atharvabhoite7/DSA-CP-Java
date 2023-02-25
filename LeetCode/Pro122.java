class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] - min > max) {
                    max = prices[i] - min;
                    sum += max;
                    max = 0;
                    min = prices[i];
                }
            }
        }

        return sum;
    }
}