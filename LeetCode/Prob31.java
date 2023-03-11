class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            Arrays.sort(nums);
        } else {
            int prev = index;

            for (int j = index + 1; j < nums.length; j++) {
                if (nums[j] > nums[index - 1] && nums[j] < nums[index]) {
                    prev = j;
                }
            }

            swap(nums, index - 1, prev);

            Arrays.sort(nums, index, nums.length);
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}