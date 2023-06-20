class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int n = (2 * k) + 1;
        long[] prefixSum = new long[nums.length + 1];
        long sum = 0;
        prefixSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum[i + 1] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            long curr = -1;
            int l = i - k;
            int r = i + k;
            if (l >= 0 && r <= nums.length - 1) {
                curr = (prefixSum[i + k + 1] - prefixSum[i - k]) / (r - l + 1);
            }
            ans[i] = (int) curr;

        }
        return ans;

    }
}