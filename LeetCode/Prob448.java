class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        return list;
    }
}