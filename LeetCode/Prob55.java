// Solution to problem number 55 of Leetcode

class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i =1; i<nums.length; i++){
            if(max==0){
                return false;
            }
           max-=1;
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return true;
    }
}
