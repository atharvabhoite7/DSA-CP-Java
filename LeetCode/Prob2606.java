class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[s.length()];
        List<Character> list = new ArrayList<>();
        for (char ch : chars.toCharArray()) {
            list.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                int idx = list.indexOf(s.charAt(i));
                arr[i] = vals[idx];
            } else {
                arr[i] = s.charAt(i) - 'a' + 1;
            }
        }

        int lastMax = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            lastMax += arr[i];
            if (lastMax > max) {
                max = lastMax;
            }

            if (lastMax < 0) {
                lastMax = 0;
            }
        }
        return max;
    }
}