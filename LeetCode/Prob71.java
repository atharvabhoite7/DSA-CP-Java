class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    continue;
                }
            } else if (s.equals("") || s.equals(".")) {
                continue;
            } else {
                st.push(s);
            }
        }
        String str = "";

        if (st.size() == 0) {
            return "/";
        }

        while (!st.isEmpty()) {
            str = "/" + st.pop() + str;
        }

        return str;

    }
}