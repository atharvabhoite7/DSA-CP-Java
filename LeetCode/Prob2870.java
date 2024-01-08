class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // Set<Integer> set= new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // set.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans = 0;
        for (int i : map.values()) {

            if (i == 1) {
                return -1;

            } else {

                ans += (i / 3);
                if (i % 3 != 0) {
                    ans++;
                }
            }

        }
        return ans;
    }
}
