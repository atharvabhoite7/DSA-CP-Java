class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < labels.length; i++) {
            pq.add(new int[] { values[i], labels[i] });
        }

        int ans = 0;

        while (numWanted > 0 && !pq.isEmpty()) {
            int[] temp = pq.poll();
            if (!map.containsKey(temp[1])) {
                ans += temp[0];
                numWanted--;
                map.put(temp[1], 1);
            } else if (map.get(temp[1]) < useLimit) {
                ans += temp[0];
                numWanted--;
                map.put(temp[1], map.get(temp[1]) + 1);
            }
        }
        return ans;

    }
}