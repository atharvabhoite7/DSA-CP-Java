class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<Integer>());

            list.add(i);
            map.put(groupSizes[i], list);

            if (groupSizes[i] == list.size()) {
                ans.add(new ArrayList<>(map.get(groupSizes[i])));
                map.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}