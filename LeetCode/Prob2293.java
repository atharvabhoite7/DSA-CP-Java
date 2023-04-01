class Solution {
    public int minMaxGame(int[] nums) {
        int[] newArr = new int[nums.length / 2];
        boolean min = true;

        if (nums.length == 1) {
            return nums[0];
        }
        int idx = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            if (min) {
                newArr[idx++] = Math.min(nums[i], nums[i + 1]);
                min = false;
            } else {
                newArr[idx++] = Math.max(nums[i], nums[i + 1]);
                min = true;
            }
        }

        return minMaxGame(newArr);
    }
}