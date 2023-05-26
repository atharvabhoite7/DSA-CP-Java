class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int sum = 0;
        int[] prefixSum = new int[words.length];
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('u');
        set.add('o');

        int[] ans = new int[queries.length];

        if (set.contains(words[0].charAt(0)) && set.contains(words[0].charAt(words[0].length() - 1))) {
            prefixSum[0] = 1;
        } else {
            prefixSum[0] = 0;
        }

        for (int i = 1; i < words.length; i++) {
            int temp = 0;
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) {
                temp = 1;
            }
            prefixSum[i] = temp + prefixSum[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            if (s == 0)
                ans[i] = prefixSum[e];
            else
                ans[i] = prefixSum[e] - prefixSum[s - 1];

        }
        return ans;
    }
}