class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            map1.put(str1[i], map1.getOrDefault(str1[i], 0) + 1);
        }

        for (int i = 0; i < str2.length; i++) {
            map2.put(str2[i], map2.getOrDefault(str2[i], 0) + 1);
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < str1.length; i++) {
            if (!map2.containsKey(str1[i]) && map1.get(str1[i]) == 1) {
                str.append(str1[i]);
                str.append(" ");
            }
        }

        for (int i = 0; i < str2.length; i++) {
            if (!map1.containsKey(str2[i]) && map2.get(str2[i]) == 1) {
                str.append(str2[i]);
                str.append(" ");
            }
        }

        String u = str.toString();

        String[] ans = u.split("\\s+");

        if (ans[0] == "") {
            return new String[0];
        }

        return ans;
    }
}