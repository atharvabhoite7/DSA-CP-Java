class Solution {
    public int minStartValue(int[] nums) {
        int start = 1;
        int pref = 0;
        for (int i = 0; i < nums.length; i++) {
            pref += nums[i];
            if (pref < 1) {
                start = Math.max(1 - pref, start);
            }
        }
        return start;
    }
}
