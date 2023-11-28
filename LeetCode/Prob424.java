class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int curr = 0;
        int l = 0;
        int[] arr = new int[26];
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            curr = Math.max(curr, arr[s.charAt(r) - 'A']);

            if (((r - l + 1) - curr) > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}