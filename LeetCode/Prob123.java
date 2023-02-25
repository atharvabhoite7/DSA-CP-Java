class Solution {
    public int maxProfit(int[] prices) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < prices.length; i++) {
            min1 = Math.min(min1, prices[i]);
            max1 = Math.max(max1, prices[i] - min1);

            min2 = Math.min(min2, prices[i] - max1);
            max2 = Math.max(max2, prices[i] - min2);
        }

        return max2;

    }
}