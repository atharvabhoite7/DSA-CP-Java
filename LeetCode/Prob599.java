class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int curr = map.get(list2[i]) + i;
                if (curr < min) {
                    min = curr;
                    list.clear();
                    list.add(list2[i]);
                } else if (curr == min) {
                    list.add(list2[i]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}