class Solution {
    public String sortVowels(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                // map.put(ch, ch-'0');
                list.add(ch);
            }
        }
        Collections.sort(list);

        StringBuilder t = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {

                char temp = list.get(0);
                t.append(temp);
                list.remove(0);

            } else {
                t.append(ch);
            }
        }

        return t.toString();

    }
}