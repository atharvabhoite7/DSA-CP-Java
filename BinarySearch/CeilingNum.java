public class CeilingNum {
    public static void main(String[] args) {
        int [] arr = {-10, -8, -2, 9, 18, 27, 34, 53, 60 };
        System.out.println(BinarySearch(arr, -4));
    }

    static int BinarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end ){

            int mid = start + (end - start)/2;

            if (target >arr[mid] ){
                start = mid +1;
            } else if (target < arr[mid]){
                end = mid -1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
