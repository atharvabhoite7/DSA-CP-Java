// Solution to problem number 2215 of Leetcode

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : nums2) {
            list2.add(i);
        }

        List<Integer> list1new = new ArrayList<>();
        List<Integer> list2new = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                if (!list1new.contains(list1.get(i))) {
                    list1new.add(list1.get(i));
                }
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) {
                if (!list2new.contains(list2.get(i))) {
                    list2new.add(list2.get(i));
                }
            }
        }

        mainList.add(list1new);
        mainList.add(list2new);
        return mainList;

    }
}