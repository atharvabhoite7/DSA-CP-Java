// Solution to problem number 283 of Leetcode

class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                swap(nums, k, low);
                low++;
            }
        }
        return;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}