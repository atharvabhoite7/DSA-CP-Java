class Solution {
    public int addMinimum(String word) {
        int i = 0;
        int j = 0;
        // StringBuilder str = new StringBuilder(word);
        String temp = "abc";
        int count = 0;

        while (i < word.length()) {
            if (word.charAt(i) == temp.charAt(j)) {
                i++;
                j++;
                // str.insert(i, temp.charAt(j));

            } else {
                count++;
                j++;
            }

            if (j > temp.length() - 1) {
                j = 0;
            }
        }

        if (word.charAt(word.length() - 1) == 'a') {
            count += 2;
        } else if (word.charAt(word.length() - 1) == 'b') {
            count++;
        }

        return count;
    }
}