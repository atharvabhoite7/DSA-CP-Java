// Solution to problem number 45 of Leetcode

class Solution {
    public int jump(int[] nums) {
        int count = 1;
        int max = nums[0];
        int reach = nums[0];

        if (nums.length == 1) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (max <= nums[i] + i) {
                max = nums[i] + i;
            }

            if (i >= reach) {
                count++;
                reach = max;
            }
        }
        return count;

    }
}