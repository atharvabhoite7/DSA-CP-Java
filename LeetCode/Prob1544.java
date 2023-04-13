class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && Character.isUpperCase(ch)) {
                if (st.peek() == Character.toLowerCase(ch)) {
                    st.pop();
                    continue;
                }
            } else if (!st.isEmpty() && Character.isLowerCase(ch)) {
                if (st.peek() == Character.toUpperCase(ch)) {
                    st.pop();
                    continue;
                }
            }

            st.push(ch);
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}