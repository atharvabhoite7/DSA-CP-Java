class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max =0;

        if(nums.length == 0){
            return 0;
        }
    
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i] +1){
                count++;
            } else if(nums[i+1] != nums[i]){
                count =0;
            }
            
            max = Math.max (max, count);
        }
        return max+1;
    }
}