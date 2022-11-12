// Solution to problem number 169 of Leetcode

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];
    }
}