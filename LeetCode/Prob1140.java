class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = piles[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = piles[i] + suffixSum[i + 1];
        }

        return helper(piles, dp, suffixSum, 0, 1);
    }

    public int helper(int[] piles, int[][] dp, int[] suffixSum, int i, int M) {
        if (i == piles.length)
            return 0;
        if (i + 2 * M >= piles.length)
            return suffixSum[i];
        if (dp[i][M] != 0)
            return dp[i][M];

        int ans = 0;

        for (int j = 1; j <= 2 * M; j++) {
            ans = Math.max(ans, suffixSum[i] - helper(piles, dp, suffixSum, i + j, Math.max(M, j)));
        }

        dp[i][M] = ans;
        return ans;
    }
}