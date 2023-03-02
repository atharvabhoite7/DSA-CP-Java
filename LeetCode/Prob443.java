class Solution {
    public int compress(char[] chars) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int j = i;
            int count = 0;

            while (j < chars.length) {
                if (chars[i] == chars[j]) {
                    count++;
                } else {
                    break;
                }
                j++;
            }

            str.append(chars[i]);

            if (count > 1) {
                i = j - 1;
                str.append(count);
            }

        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return str.length();

    }
}