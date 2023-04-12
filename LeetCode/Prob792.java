class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : map.keySet()) {
            if (check(s, str)) {
                count += map.get(str);
            }
        }
        return count;
    }

    public static boolean check(String s, String str) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < str.length()) {
            if (s.charAt(i) == str.charAt(j)) {
                j++;
            }

            if (j == str.length()) {
                return true;
            }
            i++;
        }
        return false;
    }
}