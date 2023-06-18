class Solution {
    public int findValueOfPartition(int[] nums) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i + 1] - nums[i]) < min) {
                min = Math.abs(nums[i + 1] - nums[i]);
            }
        }
        return min;
    }
}