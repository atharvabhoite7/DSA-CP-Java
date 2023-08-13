class Solution {
    public boolean validPartition(int[] nums) {
        // brute force
        // boolean flag = false;
        // int ct =1;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(nums[0], 1);

        // for(int i=1; i<nums.length-1; i++){
        // map.put(nums[i],map.getOrDefault(nums[i], 0) +1 );

        // if(nums[i] - nums[i-1] == 1 && nums[i+1] - nums[i] == 1){
        // ct++;
        // flag = true;
        // }

        // if(ct>2){
        // flag = false;
        // ct=1;
        // }
        // }
        // map.put(nums[nums.length-1],map.getOrDefault(nums[nums.length-1], 0) +1 );

        // if(!flag){
        // for(int i=0; i<nums.length; i++){
        // if(map.get(nums[i]) != 2 || map.get(nums[i]) != 3){
        // flag = false;
        // }
        // }
        // }
        // return flag;

        // dp approach
        boolean dp[] = new boolean[nums.length];
        if (nums.length == 1)
            return false;

        dp[0] = false;
        dp[1] = nums[1] == nums[0];

        for (int i = 2; i < nums.length; i++) {
            boolean v1 = isTwoElementsEqual(i, nums);
            boolean v2 = isThreeElementsEqual(i, nums);
            boolean v3 = isThreeConsEqual(i, nums);

            if (v1)
                dp[i] = dp[i - 2];

            if (v2 || v3) {
                dp[i] = dp[i] || ((i - 3) < 0 ? true : dp[i - 3]);
            }
        }

        return dp[nums.length - 1];
    }

    boolean isTwoElementsEqual(int i, int[] nums) {
        return nums[i] == nums[i - 1];
    }

    boolean isThreeElementsEqual(int i, int[] nums) {
        return nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2];
    }

    boolean isThreeConsEqual(int i, int[] nums) {
        return (nums[i] == (nums[i - 1] + 1)) && (nums[i - 1] == (nums[i - 2] + 1));

    }
}