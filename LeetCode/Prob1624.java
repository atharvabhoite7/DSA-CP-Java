// Solution to problem number 1624 of Leetcode

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] arr = s.toCharArray();
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr.length > 2 && arr[i] == arr[j]) {
                    count = j - i - 1;
                    set.add(count);
                } else if (arr.length == 2 && arr[i] == arr[j]) {
                    return 0;
                }
            }
        }

        Integer maxVal = Collections.max(set);
        int ans = maxVal.intValue();

        if (ans > 0) {
            return ans;
        } else {
            return -1;
        }
    }
}