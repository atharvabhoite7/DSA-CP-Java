class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                list.remove(list.lastIndexOf(nums[i]));
                pair++;
            } else {
                list.add(nums[i]);
            }
        }

        int[] arr = { pair, list.size() };
        return arr;
    }
}