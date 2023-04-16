class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int count = 0;
        int max = 0;
        int ans = divisors[0];
        for (int i = 0; i < divisors.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = divisors[i];
            } else if (count == max) {
                if (divisors[i] < ans) {
                    ans = divisors[i];
                }
            }
        }
        return ans;
    }
}