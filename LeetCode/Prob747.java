class Solution {
    public int dominantIndex(int[] nums) {

        int lg = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > lg) {
                lg = nums[i];
                index = i;
            }
        }

        Arrays.sort(nums);

        // boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (lg < 2 * nums[i]) {
                return -1;
            }
        }
        return index;
    }
}