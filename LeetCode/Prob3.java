// Solution to problem number 3 of Leetcode

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();

        int curr = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!list.contains(ch)) {
                list.add(ch);
                curr++;
            } else if (list.contains(ch)) {
                if (curr > max) {
                    max = curr;
                }
                list.subList(0, list.lastIndexOf(ch) + 1).clear();
                list.add(ch);
                curr = list.size();
            }
            if (curr > max) {
                max = curr;
            }
        }

        if (s.length() == 0) {
            return 0;
        }

        if (list.isEmpty()) {
            return 1;
        }
        return max;
    }
}
