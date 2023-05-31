class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x = 0, y = 1;
        for (int i = 2; i < nums.length; i++) {
            if ((nums[x] < nums[y] && nums[y] < nums[i]) || (nums[x] > nums[y] && nums[y] > nums[i])) {
                int temp = nums[i];
                nums[i] = nums[y];
                nums[y] = temp;
            }
            x++;
            y++;
        }
        return nums;
    }
}