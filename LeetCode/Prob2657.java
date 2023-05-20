class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            // count = 0;
            if (A[i] == B[i]) {
                count++;
            }

            if (setA.contains(B[i])) {
                count++;
            }

            if (setB.contains(A[i])) {
                count++;
            }

            ans.add(count);

            setA.add(A[i]);
            setB.add(B[i]);
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}