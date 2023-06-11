class Solution {
    public String smallestString(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int n = s.length();
        while (i < n && c[i] == 'a') {
            i++;
        }

        if (i == n) {
            c[n - 1] = 'z';
        } else {
            while (i < n && c[i] != 'a') {
                c[i] = (char) (c[i] - 1);
                i++;
            }
        }
        String ans = String.valueOf(c);
        return ans;
    }
}