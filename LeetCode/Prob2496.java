// Solution to problem number 2496 of Leetcode

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            boolean letterPresent = false;
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) >= 'a' && strs[i].charAt(j) <= 'z') {
                    letterPresent = true;
                }
            }
            if (letterPresent) {
                max = Math.max(max, strs[i].length());
            } else {
                max = Math.max(max, Integer.parseInt(strs[i]));
            }
        }
        return max;
    }
}