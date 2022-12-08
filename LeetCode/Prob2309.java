// Solution to problem number 2309 of Leetcode

class Solution {
    public String greatestLetter(String s) {

        HashSet<Character> set = new HashSet<Character>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (set.contains(ch) && set.contains((char) ('a' + (ch - 'A')))) {
                return ch + "";
            }
        }
        return "";
    }
}