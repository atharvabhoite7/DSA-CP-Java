class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list = findDiv(nums[i]);
            if (list.size() == 4) {
                for (int j = 0; j < list.size(); j++) {
                    sum += list.get(j);
                }

            } else {
                continue;
            }
        }
        return sum;
    }

    public List<Integer> findDiv(int num) {
        int root = (int) Math.sqrt(num);
        System.out.println(root);
        List<Integer> list = new ArrayList<>();
        // list.add(num);

        for (int i = 1; i <= root; i++) {
            if (num % i == 0) {
                list.add(i);
                int temp = num / i;
                if (temp != i) {
                    list.add(temp);
                }

            }
        }

        System.out.println(list);
        return list;
    }

}