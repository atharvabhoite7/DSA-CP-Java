class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] <= timeSeries[i - 1] + duration) {
                ans += timeSeries[i] - timeSeries[i - 1];
            } else {
                ans += duration;
            }
        }
        return ans;
    }
}