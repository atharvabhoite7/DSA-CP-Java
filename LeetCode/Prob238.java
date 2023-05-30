class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int temp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = prod;
            prod = prod * nums[i];
        }

        prod = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            temp[i] = temp[i] * prod;
            prod = prod * nums[i];
        }
        return temp;
    }
}