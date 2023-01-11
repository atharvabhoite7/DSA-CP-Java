// Solution to problem number 1827 of Leetcode

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i+1]+=1;
                count+=1;
            } else if(nums[i+1]<nums[i]){
                count += nums[i] - nums[i+1] + 1;
                nums[i+1] += nums[i] - nums[i+1] + 1;
            }
        }
        return count;
    }
}
