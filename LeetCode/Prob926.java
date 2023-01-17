// Solution to problem number 926 of Leetcode

class Solution {
    public int minFlipsMonoIncr(String s) {
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (count1 == 0) {
                    continue;
                } else {
                    count0++;
                }
            } else {
                count1++;
            }
            if (count0 > count1) {
                count0 = count1;
            }
        }
        return count0;
    }
}