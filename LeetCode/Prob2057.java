// Solution to problem number 2057 of Leetcode

class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = i % 10;
            if (num == nums[i]) {
                list.add(i);
            }
        }
        if (!list.isEmpty()) {
            Collections.sort(list);
            return list.get(0);
        }

        return -1;
    }
}