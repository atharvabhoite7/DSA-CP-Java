// Solution to problem number 561 of Leetcode

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length-1; i=i+2){
            list.add(Math.min(nums[i], nums[i+1]));
        }

        int sum=0;
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
