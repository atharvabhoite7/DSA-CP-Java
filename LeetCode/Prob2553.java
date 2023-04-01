class Solution {
    public int[] separateDigits(int[] nums) {
        String ans = "";
        for (int i : nums) {
            ans += i;
        }

        int[] newArr = new int[ans.length()];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = ans.charAt(i) - '0';
        }
        return newArr;
    }
}