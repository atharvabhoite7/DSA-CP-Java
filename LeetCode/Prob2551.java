class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;

        if (k == 0) {
            return 0;
        }

        int[] costs = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            costs[i] = weights[i] + weights[i + 1];
        }

        Arrays.sort(costs);
        long min = 0;
        long max = 0;

        for (int i = 0; i < k - 1; i++) {
            min += costs[i];
            max += costs[n - i - 2];
        }

        return max - min;
    }
}