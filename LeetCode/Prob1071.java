// Solution to problem number 1071 of Leetcode

class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int s1 = str1.length();
        int s2 = str2.length();
        if ((str1 + str2).equals(str2 + str1)) {
            int i;
            for (i = Math.min(s1, s2); i >= 2; i--) {
                if (s1 % i == 0 && s2 % i == 0) {
                    break;
                }
            }
            return str1.substring(0, i);
        } else {
            return "";
        }

    }
}