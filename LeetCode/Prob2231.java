class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i] && (arr[j] - arr[i]) % 2 == 0) {
                    char t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        return Integer.parseInt(new String(arr));
    }
}