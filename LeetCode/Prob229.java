import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > num) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}