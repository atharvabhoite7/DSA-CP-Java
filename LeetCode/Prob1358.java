class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int start = 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                arr[s.charAt(start++) - 'a']--;
            }
            count += start;
        }
        return count;
    }
}
