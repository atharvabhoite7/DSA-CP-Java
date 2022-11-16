// Solution to problem number 485 of Leetcode

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean flag = false;
        int count = 0;
        int max = 0;
        for (int i : nums) {
            if (i == 1) {
                if (!flag) {
                    flag = !flag;
                    count = 1;
                    ;
                } else {
                    count++;
                }
            } else {
                max = count > max ? count : max;

                flag = false;
                count = 0;
            }
        }
        max = count > max ? count : max;
        return max;
    }
}