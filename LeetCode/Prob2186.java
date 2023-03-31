class Solution {
    public int minSteps(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            f1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            f2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < f1.length; i++) {
            int c1 = f1[i];
            int c2 = f2[i];
            if (c1 != c2) {
                sum += Math.abs(c1 - c2);
            }
        }
        return sum;
    }
}