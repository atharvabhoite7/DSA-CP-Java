
// Solution to problem number 2414 of Leetcode

class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 0;
        int curr = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if ((int) ch + 1 == (int) ch2) {
                count++;
                if (count > curr) {
                    curr = count;
                }
            } else {
                count = 0;
            }
        }
        return curr + 1;
    }
}