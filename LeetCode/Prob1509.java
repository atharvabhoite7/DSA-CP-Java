class Solution {
    public int minDifference(int[] nums) {

        if (nums.length <= 4) {
            return 0;
        }

        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 4;
        int min = Integer.MAX_VALUE;

        while (r < nums.length) {
            min = Math.min(min, nums[r] - nums[l]);
            r++;
            l++;
        }

        return min;
    }
}