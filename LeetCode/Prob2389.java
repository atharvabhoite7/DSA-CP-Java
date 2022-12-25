// Solution to problem number 2389 of Leetcode

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int sum = 0;
            int index = 0;
            while (index < nums.length) {
                if (sum + nums[index] <= queries[i]) {
                    sum += nums[index];
                    count++;
                }
                index++;
            }
            answer[i] = count;
        }
        return answer;
    }
}