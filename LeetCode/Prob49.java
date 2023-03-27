class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}