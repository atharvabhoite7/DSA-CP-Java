// Solution to problem number 151 of Leetcode

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        StringBuilder build = new StringBuilder();

        build.append(str[str.length - 1]);
        for (int i = str.length - 2; i >= 0; i--) {
            build.append(" " + str[i]);
        }
        return build.toString().trim();
    }
}