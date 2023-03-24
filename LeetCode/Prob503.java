class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        int arr[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }

        Arrays.fill(ans, -1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > nums[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}