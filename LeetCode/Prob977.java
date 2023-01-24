// Solution to problem number 977 of Leetcode

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            arr[i] = n * n;
        }

        Arrays.sort(arr);
        return arr;
    }
}