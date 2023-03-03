class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split("\\s+");

        String last = str[str.length - 1];
        String first = str[0];
        if (last.charAt(last.length() - 1) != first.charAt(0)) {
            return false;
        }

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].charAt(str[i].length() - 1) != str[i + 1].charAt(0)) {
                return false;
            }
        }
        return true;

    }
}