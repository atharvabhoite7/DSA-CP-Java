// Solution to problem number 58 of Leetcode

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int last = str.lastIndexOf(' ')+1;
        return str.length()-last;
       
    }
}