class Solution {
    public int similarPairs(String[] words) {
        List<HashSet<Character>> mainList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            HashSet<Character> set = new HashSet<>();
            char ch[] = words[i].toCharArray();
            Arrays.sort(ch);
            for (int j = 0; j < ch.length; j++) {
                set.add(ch[j]);
            }
            mainList.add(set);
        }

        for (int i = 0; i < mainList.size(); i++) {
            for (int j = i + 1; j < mainList.size(); j++) {
                if (mainList.get(i).equals(mainList.get(j))) {
                    count++;
                }
            }
        }
        return count;

    }
}