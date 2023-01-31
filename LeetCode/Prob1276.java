// Solution to problem number 1276 of Leetcode

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cs = cheeseSlices;
        int ts = tomatoSlices;

        if (ts < cs * 2 || ts > cs * 4 || ts % 2 != 0 || (ts == 0 && cs > 0) || (cs == 0 && ts > 0)) {
            return list;
        }

        int jumbo = 0;

        while (cs > 0 && ts > 0 && ts != cs * 2) {
            jumbo++;
            cs--;
            ts -= 4;
        }

        list.add(jumbo);
        list.add(cs);
        return list;

    }
}