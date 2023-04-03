class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            // set.add(nums[i]);
        }

        for (int i : nums) {
            if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) {
                list.add(i);
            }
        }
        return list;
    }
}