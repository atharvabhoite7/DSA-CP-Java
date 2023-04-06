class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.addAll(map.keySet());

        int idx = score.length;

        while (!pq.isEmpty()) {
            int num = pq.poll();
            int val = map.get(num);
            str[val] = String.valueOf(idx);
            if (pq.size() == 2) {
                str[val] = "Bronze Medal";
            } else if (pq.size() == 1) {
                str[val] = "Silver Medal";
            } else if (pq.size() == 0) {
                str[val] = "Gold Medal";
            }
            idx--;
        }

        return str;

    }
}