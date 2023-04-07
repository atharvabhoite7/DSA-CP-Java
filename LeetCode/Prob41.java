class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int idx = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }

            if (nums[i] != idx) {
                return idx;
            }
            idx++;
        }
        return idx;
    }
}