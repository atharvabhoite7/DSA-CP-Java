class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        List<String> list = new ArrayList<>();
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> (map.get(b).equals(map.get(a))) ? a.compareTo(b) : map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        while (k > 0) {
            k--;
            list.add(pq.poll());
        }

        return list;
    }
}