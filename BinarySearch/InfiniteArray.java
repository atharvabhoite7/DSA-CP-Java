// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { -2, -10, -8, 9, 18, 27, 34, 53, 60 };
        int target = 27;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            end = (end - start + 1)*2;
            start = newStart;
        }
       

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}