// Solution to problem number 451 of Leetcode

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> (map.get(b) - map.get(a)));
        pq.addAll(map.keySet());
        
        StringBuilder str = new StringBuilder();

        while (!pq.isEmpty()) {
            char curr = pq.remove();
            for (int i = 0; i < map.get(curr); i++) {
                str.append(curr);
            }
        }
        return str.toString();
    }
}
