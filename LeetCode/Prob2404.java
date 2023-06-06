import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        Entry<Integer, Integer> freq = null;

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (freq == null || entry.getValue() > freq.getValue()) {
                freq = entry;
            } else if (entry.getValue() == freq.getValue() && entry.getKey() < freq.getKey()) {
                freq = entry;
            }
        }
        return freq == null ? -1 : freq.getKey();
    }
}