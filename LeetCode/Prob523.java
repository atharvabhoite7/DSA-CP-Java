class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            if (map.containsKey(rem)) {
                if (i + 1 - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i + 1);
            }
        }
        return false;
    }
}