class Solution {
    public int minSteps(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            f1[s.charAt(i) - 'a']++;
            f2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < f1.length; i++) {
            if (f1[i] - f2[i] > 0) {
                max += f1[i] - f2[i];
            }
        }

        return max;
    }
}