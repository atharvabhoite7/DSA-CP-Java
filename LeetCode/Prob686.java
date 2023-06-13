class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s = a;
        int ct = 1;
        if (b.length() == 0) {
            return 0;
        } else if (a.contains(b)) {
            return 1;
        }
        while (a.length() <= s.length() + b.length()) {
            a += s;
            ct++;
            if (a.contains(b)) {
                return ct;
            }
        }
        return -1;
    }
}