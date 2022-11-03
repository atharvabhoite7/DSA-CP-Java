public class FindMin {
    public static void main(String[] args) {
        int [] arr= {45, 56, 35, 89, 71};
        System.out.println(find(arr));
    }

    static int find(int [] arr){
        int minTerm = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minTerm ){
                minTerm = arr[i];
            }
        }
        return minTerm;
    }
}
