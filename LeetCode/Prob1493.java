class Solution {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return nums.length - 1;
        } else if (list.size() == 1) {
            return nums.length - 1;
        }

        int s = 0;
        int e = 1;
        int max = list.get(e) - 1;
        e++;

        while (e < list.size()) {
            int curr = list.get(e) - list.get(s) - 2;
            max = Math.max(max, curr);
            s++;
            e++;
        }

        if (list.size() >= 2) {
            int curr = nums.length - list.get(s) - 2;
            max = Math.max(max, curr);
        }
        return max;

    }
}