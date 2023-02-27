class Solution {
    public int pivotIndex(int[] nums) {
        int sumI = 0;
        int sumJ = 0;
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sumI += nums[i];
            sumLeft[i] = sumI;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            sumJ += nums[i];
            sumRight[i] = sumJ;
        }

        for (int i = 0; i <= nums.length - 1; i++) {
            if (sumRight[i] == sumLeft[i]) {
                return i;
            }
        }

        return -1;
    }
}