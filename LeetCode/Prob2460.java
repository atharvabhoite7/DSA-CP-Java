class Solution {
    public int[] applyOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            }
            if (nums[i] == nums[i + 1]) {
                list.add(2 * nums[i]);
                i++;
                count++;
            } else {
                list.add(nums[i]);
            }
        }

        if (nums[nums.length - 1] == 0) {
            count++;
        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            list.add(nums[nums.length - 1]);
        }

        for (int i = 1; i <= count; i++) {
            list.add(0);
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
