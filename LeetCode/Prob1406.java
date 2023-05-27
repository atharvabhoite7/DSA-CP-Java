class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        Integer dp[] = new Integer[n];
        int diff = helper(stoneValue, n, 0, dp);
        if (diff > 0) {
            return "Alice";
        } else if (diff < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }

    public int helper(int stoneValue[], int n, int i, Integer[] dp) {
        if (i == n) {
            return 0;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        int ans = stoneValue[i] - helper(stoneValue, n, i + 1, dp);

        if (i + 2 <= n) {
            ans = Math.max(ans, stoneValue[i] + stoneValue[i + 1] - helper(stoneValue, n, i + 2, dp));
        }

        if (i + 3 <= n) {
            ans = Math.max(ans,
                    stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - helper(stoneValue, n, i + 3, dp));
        }
        dp[i] = ans;
        return ans;
    }
}