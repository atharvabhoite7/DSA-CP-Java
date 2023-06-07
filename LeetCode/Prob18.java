class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int p1 = j + 1;
                int p2 = nums.length - 1;

                while (p1 < p2) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[p1];
                    sum += nums[p2];

                    if (sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[p1], nums[p2]));
                        p1++;
                        p2--;
                    } else if (sum < target) {
                        p1++;
                    } else {
                        p2--;
                    }
                }
            }

        }
        ans.addAll(set);
        return ans;
    }
}