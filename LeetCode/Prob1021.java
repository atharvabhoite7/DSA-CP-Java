class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder str = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                count--;
            }

            if (count != 0) {
                str.append(ch);
            }

            if (ch == '(') {
                count++;
            }
        }

        return str.toString();
    }
}