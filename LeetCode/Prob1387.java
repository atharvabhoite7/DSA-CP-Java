class Solution {
    public int getKth(int lo, int hi, int k) {
        // int[] arr = new int[hi - lo +1];
        // int idx=0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)==
        // map.get(b) ? a- b :map.get(a) - map.get(b));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = lo; i <= hi; i++) {
            int temp = calc(i, 0);
            // map.put(i, temp );
            list.add(temp * 10000 + i);
        }

        Collections.sort(list);

        // for(int i:map.keySet()){
        // pq.add(i);
        // }

        return (list.get(k - 1)) % 10000;

        // return pq.poll();

    }

    public int calc(int num, int steps) {
        if (num == 1) {
            return steps;
        }

        if (num % 2 == 0) {
            num /= 2;
            steps++;
        } else {
            num = (3 * num) + 1;
            steps++;
        }

        return calc(num, steps);
    }
}