// Solution to problem number 414 of Leetcode

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        if (list.size() < 3) {
            return list.get(list.size() - 1);
        } else {
            return list.get(list.size() - 3);
        }
    }
}