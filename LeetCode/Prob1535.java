class Solution {
    public int getWinner(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(0) > list.get(1)) {
                int digit = list.get(1);
                list.remove(1);
                list.add(digit);
                count++;
            } else if (list.get(1) >= list.get(0)) {
                int num = list.get(0);
                list.remove(0);
                list.add(num);
                count = 1;
            }

            if (count == k) {
                return list.get(0);
            }
        }

        return list.get(0);

    }
}