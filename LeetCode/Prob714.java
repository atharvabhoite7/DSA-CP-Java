class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] > min + fee) {
                    sum += (prices[i] - min - fee);
                    System.out.println(sum + "," + i);
                    min = prices[i] - fee;
                }
            }
        }
        return sum;
    }
}