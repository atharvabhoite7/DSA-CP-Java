class Solution {
    public int maximumProduct(int[] nums) {
        long prod = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int l = nums.length - 1;
        return Math.max(nums[0] * nums[1] * nums[l], nums[l - 2] * nums[l - 1] * nums[l]);
    }
}