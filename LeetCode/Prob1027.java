class Solution {
    public int longestArithSeqLength(int[] nums) {
        int max = 2;
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> tmap = new HashMap<>();
            map.put(i, tmap);
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                int len = map.get(j).getOrDefault(diff, 1) + 1;
                tmap.put(diff, len);
                max = Math.max(max, len);
            }
        }
        return max;
    }
}