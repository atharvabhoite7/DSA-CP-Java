class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        HashSet<String> set = new HashSet<>(dictionary);

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                String temp = s[i].substring(0, j + 1);
                if (set.contains(temp)) {
                    s[i] = temp;
                    break;
                }
            }
        }

        String ans = "";

        for (int i = 0; i < s.length; i++) {
            ans += s[i];
            if (i != s.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}