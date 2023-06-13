class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> l3 = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                l3.add(grid[i][j]);
            }
            l1.add(l3);
        }

        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> l3 = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                l3.add(grid[j][i]);
            }
            l2.add(l3);
        }

        System.out.println(l1);
        System.out.println(l2);

        int ct = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    ct++;
                }
            }
        }
        return ct;

    }
}