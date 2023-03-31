class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        StringBuilder str = new StringBuilder();

        for (char ch : arr) {
            str.append(ch);
        }
        return str.toString();
    }
}