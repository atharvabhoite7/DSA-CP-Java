class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == key) {
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
            }
        }

        int max = 0;
        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
    }
}