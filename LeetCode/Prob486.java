class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int sum =0;
        for(int i: nums){
            sum+=i;
        }

        int ans = predict(nums, 0, nums.length-1);
        if(ans<(sum - ans)){
            return false;
        }
        return true;

    }

    public int predict(int[] nums, int left , int right){
        if(left> right){
            return 0;
        }

        int op1 = nums[left] + Math.min(predict(nums, left+2, right), predict(nums, left+1, right-1));
        int op2 = nums[right] + Math.min(predict(nums, left+1, right-1), predict(nums, left, right-2));
        return Math.max(op1, op2);
    }
}