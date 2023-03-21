class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long cons = 0;
        if (nums[0] == 0) {
            count++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }

            if (nums[i - 1] == 0 && nums[i] == 0) {
                cons++;
                count += cons;
            } else {

                cons = 0;
            }
        }
        return count;
    }
}