class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int cons = 0;
        int count = 0;
        if (nums.length < 3) {
            return 0;
        }
        if (nums[2] - nums[1] == nums[1] - nums[0]) {
            count++;

        }
        for (int i = 3; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                count++;
            }

            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]
                    && nums[i - 1] - nums[i - 2] == nums[i - 2] - nums[i - 3]) {
                cons++;
                count += cons;

            } else {
                cons = 0;
            }
        }

        return count;
    }
}