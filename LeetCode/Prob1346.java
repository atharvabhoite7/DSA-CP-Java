class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        }
        Arrays.sort(arr);

        for (int i : arr) {
            if (i != 0) {
                int num = 2 * i;
                if (list.contains(num)) {
                    return true;
                }
            } else {
                list.remove(Integer.valueOf(0));
                int num = 2 * i;
                if (list.contains(num)) {
                    return true;
                }
            }

        }
        return false;
    }
}