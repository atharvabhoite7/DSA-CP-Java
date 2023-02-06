// Solution to problem number 1470 of Leetcode

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        int x = 0;
        int y = n;
        // int index=0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[x];
                x++;
            } else {
                arr[i] = nums[y];
                y++;
            }
        }
        return arr;
    }
}