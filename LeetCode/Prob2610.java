class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < list.size(); i++) {
                set.add(list.get(i));
            }

            for (int i : set) {
                temp.add(i);
                list.remove(list.lastIndexOf(i));
            }
            ans.add(temp);
        }
        return ans;
    }
}