class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[index] < nums[j]) {
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}