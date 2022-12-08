// Solution to problem number 1046 of Leetcode

class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : stones) {
            list.add(i);
        }

        while (list.size() > 1) {
            Collections.sort(list);
            Integer x = list.get(list.size() - 2);
            Integer y = list.get(list.size() - 1);

            if (x != y) {
                list.remove(x);
                list.remove(y);
                y = y - x;
                list.add(y);
            } else {
                list.remove(x);
                list.remove(y);
            }
        }

        if (list.size() == 0) {
            return 0;
        } else {
            return list.get(0);
        }
    }
}