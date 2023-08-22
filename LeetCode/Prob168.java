class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer, Character> map = new HashMap<>();
        char ch = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(i, ch);
            ch++;
        }

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            int rem = (columnNumber - 1) % 26;
            ans.insert(0, map.get(rem + 1));
            columnNumber = (columnNumber - 1) / 26;
        }

        return ans.toString();
    }
}