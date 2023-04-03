class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ans = target - 'a';
        int small = Integer.MAX_VALUE;
        char ch = '$';

        for (int i = 0; i < letters.length; i++) {
            int num = letters[i] - 'a';
            if (num > ans && num < small) {
                ch = letters[i];
                small = num;
            }
        }

        if (ch == '$') {
            return letters[0];
        }
        return ch;
    }
}