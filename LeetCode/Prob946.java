class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int idx = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek() == popped[idx]) {
                idx++;
                st.pop();
            }
        }

        while (!st.isEmpty()) {
            if (popped[idx] == st.peek()) {
                st.pop();
                idx++;
            } else {
                return false;
            }
        }
        return true;
    }
}