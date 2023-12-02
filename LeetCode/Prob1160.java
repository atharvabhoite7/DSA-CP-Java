class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }

        int riyal = 0;
        for (String s : words) {
            int[] temp = new int[26];
            for (char ch : s.toCharArray()) {
                temp[ch - 'a']++;
            }

            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < temp[i]) {
                    flag = false;
                }
            }

            if (flag)
                riyal += s.length();
        }

        return riyal;
    }
}