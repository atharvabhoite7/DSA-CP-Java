class Solution {
    public int minOperations(int[] nums, int x) {
        int s = 0;
        int e = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int maxSum = sum - x;

        int currSum = 0;
        int maxLength = -1;
        while (e < nums.length) {
            currSum += nums[e];

            while (s < nums.length & currSum > maxSum) {
                currSum -= nums[s++];
            }

            if (currSum == maxSum)
                maxLength = Math.max(maxLength, e - s + 1);
            e++;
        }

        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}