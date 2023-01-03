// Solution to problem number 2264 of Leetcode

class Solution {
    public String largestGoodInteger(String num) {
        char[] arr = num.toCharArray();

        int count = 1;

        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count == 3) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);

        char[] arr2 = new char[3];

        if (list.isEmpty()) {
            return "";
        }

        for (int i = 0; i < 3; i++) {
            if (list.size() > 1) {
                arr2[i] = list.get(list.size() - 1);
            } else {
                arr2[i] = list.get(0);
            }

        }

        return String.valueOf(arr2);
    }
}
