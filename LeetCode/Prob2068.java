// Solution to problem number 2068 of Leetcode

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr = new int[26];

        for (char ch : word1.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            arr[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(arr[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}