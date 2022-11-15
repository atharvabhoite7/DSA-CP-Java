// Solution to problem number 520 of Leetcode

class Solution {
    public boolean detectCapitalUse(String word) {

        boolean allCap = true;
        boolean allSmall = true;

        boolean onlyFirstCap = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';

        for (int i = 1; i < word.length(); i++) {
            char k = word.charAt(i);
            if (k >= 'A' && k <= 'Z') {
                allSmall = false;
            } else if (k >= 'a' && k <= 'z') {
                allCap = false;
            }
        }

        if (allCap && onlyFirstCap) {
            return true;
        }
        if (allSmall && !onlyFirstCap) {
            return true;
        }
        if (allSmall && onlyFirstCap) {
            return true;
        }

        return false;

    }
}
