class Solution {
    public long subArrayRanges(int[] nums) {
        long count = 0;
        long big = Integer.MIN_VALUE;
        long smol = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            big = Integer.MIN_VALUE;
            smol = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                big = Math.max(big, nums[j]);
                smol = Math.min(smol, nums[j]);
                count += big - smol;
            }
        }
        return count;
    }
}