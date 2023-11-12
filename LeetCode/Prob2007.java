class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] dum = new int[0];
        int n = changed.length;
        if (changed.length % 2 != 0)
            return dum;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[changed.length / 2];
        for (int i = 0; i < n; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }
        Arrays.sort(changed);

        int idx = 0;
        for (int i = 0; i < changed.length; i++) {
            if (map.get(changed[i]) > 0) {
                map.put(changed[i], map.get(changed[i]) - 1);
                int twice = changed[i] * 2;
                if (map.containsKey(twice) && map.get(twice) > 0) {
                    map.put(twice, map.get(twice) - 1);
                    ans[idx++] = changed[i];
                } else {
                    return dum;
                }
            }
        }

        return ans;
    }
}