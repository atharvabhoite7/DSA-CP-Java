class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 1;
        set.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                count++;
                set.clear();
            }
            set.add(s.charAt(i));
        }
        return count;
    }
}