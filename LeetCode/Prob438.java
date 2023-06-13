class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len = p.length();
        int i = 0;
        int e = len;
        while (e <= s.length()) {
            if (isAnagram(s.substring(i, e), p)) {
                list.add(i);
            }
            i++;
            e++;
        }
        return list;
    }

    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            arr[ch - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}