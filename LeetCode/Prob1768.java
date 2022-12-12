// Solution to problem number 1768 of Leetcode

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int max = Math.max(arr1.length, arr2.length);
        int min = Math.min(arr1.length, arr2.length);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < min; i++) {
            str.append(arr1[i]);
            str.append(arr2[i]);
        }

        for (int i = min; i < max; i++) {
            if (arr1.length == max) {
                str.append(arr1[i]);
            } else if (arr2.length == max) {
                str.append(arr2[i]);
            }
        }

        return str.toString();

    }
}