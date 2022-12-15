// Solution to problem number 1832 of Leetcode

class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();

        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!list.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}