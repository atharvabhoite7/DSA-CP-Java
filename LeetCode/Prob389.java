// Solution to problem number 389 of Leetcode

class Solution {
    public char findTheDifference(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        int countS = 0;
        int countT = 0;

        if (arrS.length == 0) {
            return arrT[0];
        }

        for (int i = 0; i < arrS.length; i++) {
            countS += (int) arrS[i];
        }

        for (int i = 0; i < arrT.length; i++) {
            countT += (int) arrT[i];
        }

        int finalCount = countT - countS;
        return (char) finalCount;
    }
}