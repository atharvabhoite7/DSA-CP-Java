class Solution {
    public int partitionArray(int[] nums, int k) {
        int count = 0;
        int j = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while (j < nums.length && nums[j] - nums[i] <= k) {
                j++;
            }
            count++;
            i = j - 1;
        }
        return count;
    }
}