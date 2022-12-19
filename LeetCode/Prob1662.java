// Solution to problem number 1662 of Leetcode

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String s : word1) {
            str1.append(s);
        }

        for (String s : word2) {
            str2.append(s);
        }

        if (str1.toString().equals(str2.toString())) {
            return true;
        }
        return false;
    }
}
