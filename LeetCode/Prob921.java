// Solution to problem number 921 of Leetcode

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(1);
            } else if (!st.isEmpty() && s.charAt(i) == ')') {
                st.pop();
            } else if (st.isEmpty() && s.charAt(i) == ')') {
                count++;
            }
        }

        while (!st.isEmpty()) {
            st.pop();
            count++;
        }

        return count;

    }
}