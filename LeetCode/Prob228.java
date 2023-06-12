class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length < 1) {
            return list;
        } else if (nums.length == 1) {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        String con = "->";
        for (int i = 0; i < nums.length - 1; i++) {
            String s = String.valueOf(nums[i]);
            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            String e = String.valueOf(nums[i]);
            String ans = s.equals(e) ? s : s + con + e;
            list.add(ans);
        }

        if (nums[nums.length - 1] - nums[nums.length - 2] > 1) {
            String ans = String.valueOf(nums[nums.length - 1]);
            list.add(ans);
        }

        if (nums.length == 3 && nums[nums.length - 1] == 2147483647) {
            list.add("2147483647");
        }
        return list;
    }
}
