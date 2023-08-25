class Solution {
    public String reorganizeString(String s) {
        if (s.length() == 0)
            return "";

        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 1) {
            char ch1 = pq.poll();
            char ch2 = pq.poll();

            sb.append(ch1);
            sb.append(ch2);
            map.put(ch1, map.get(ch1) - 1);
            map.put(ch2, map.get(ch2) - 1);

            if (map.get(ch1) > 0)
                pq.add(ch1);
            if (map.get(ch2) > 0)
                pq.add(ch2);

        }

        if (pq.size() == 1) {
            char last = pq.poll();
            if (map.get(last) > 1)
                return "";
            sb.append(last);
        }

        return sb.toString();

    }
}