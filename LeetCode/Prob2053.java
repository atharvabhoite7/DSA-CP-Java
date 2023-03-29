class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                list.add(arr[i]);
                set.add(arr[i]);
            } else {
                list.remove(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            k--;
            if (k == 0) {
                return list.get(i);
            }
        }
        return "";

    }
}