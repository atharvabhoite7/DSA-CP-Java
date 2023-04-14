class Solution {
    public int minimumDeletions(int[] nums) {
        int min = -1;
        int minNum = Integer.MAX_VALUE;
        int max = -1;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                max = i;
            }

            if (nums[i] < minNum) {
                minNum = nums[i];
                min = i;
            }
        }

        int s = -1;
        int e = -1;

        if (max < min) {
            s = max;
            e = min;
        } else {
            s = min;
            e = max;
        }
        return Math.min(e + 1, Math.min(nums.length - s, s + 1 + nums.length - e));
    }
}