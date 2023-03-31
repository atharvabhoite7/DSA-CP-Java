class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> listLoser = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < matches.length; i++) {
            int loser = matches[i][1];
            int winner = matches[i][0];
            set.add(loser);
            set.add(winner);

            map.put(loser, map.getOrDefault(loser, 0) + 1);
            // if(!listLoser.contains(loser) ){
            // listLoser.add(loser);
            // }
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int i : set) {
            if (!map.containsKey(i)) {
                noLoss.add(i);
            }

            if (map.containsKey(i) && map.get(i) == 1) {
                oneLoss.add(i);
            }

        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        ans.add(noLoss);
        ans.add(oneLoss);
        return ans;
    }
}