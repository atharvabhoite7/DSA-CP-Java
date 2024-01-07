class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                if (diff <= Integer.MAX_VALUE && diff >= Integer.MIN_VALUE) {
                    int d = (int) diff;
                    int jCt = dp[j].getOrDefault(d, 0);
                    int iCt = dp[i].getOrDefault(d, 0);
                    dp[i].put(d, jCt + iCt + 1);
                    ans += jCt;
                }
            }

        }
        return ans;
    }
}