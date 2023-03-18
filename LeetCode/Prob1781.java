class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                sum += findBeauty(freq);
            }
        }
        return sum;
    }

    public static int findBeauty(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i != 0) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        return max - min;
    }
}