class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String str : tokens) {

            if (str.length() == 1 && str.charAt(0) < '0') {
                if (str.charAt(0) == '*') {
                    int i1 = s.pop();
                    int i2 = s.pop();
                    int ans = i1 * i2;
                    s.push(ans);
                    continue;
                }

                else if (str.charAt(0) == '/') {
                    int i1 = s.pop();
                    int i2 = s.pop();
                    int ans = i2 / i1;
                    s.push(ans);
                    continue;
                }

                else if (str.charAt(0) == '+') {
                    int i1 = s.pop();
                    int i2 = s.pop();
                    int ans = i1 + i2;
                    s.push(ans);
                    continue;
                }

                else if (str.charAt(0) == '-') {
                    int i1 = s.pop();
                    int i2 = s.pop();
                    int ans = i2 - i1;
                    s.push(ans);
                    continue;
                }
            } else{
                s.push(Integer.parseInt(str));
                continue;
            }

        }
        return s.pop();
    }
}
