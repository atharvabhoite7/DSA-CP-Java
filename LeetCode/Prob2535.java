// Solution to problem number 2535 of Leetcode

class Solution {
    public int differenceOfSum(int[] nums) {
        int elemSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elemSum += nums[i];
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                list.add(nums[i] % 10);
                nums[i] /= 10;
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return Math.abs(sum - elemSum);
    }
}