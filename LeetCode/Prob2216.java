class Solution {
    public int minDeletion(int[] nums) {
        int ct = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if ((i - ct) % 2 == 0 && nums[i] == nums[i + 1]) {
                i--;
                ct++;
            }
        }
        if ((nums.length - ct) % 2 != 0) {
            ct++;
        }
        return ct;
    }
}