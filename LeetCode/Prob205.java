class Solution {
    public boolean isIsomorphic(String s, String t) {
        Boolean ans;
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) == t.charAt(i)) {
                    ans = true;
                } else {
                    return false;
                }
            } else {
                if (map2.containsKey(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                    map2.put(t.charAt(i), true);
                }
            }
        }
        return true;
    }
}