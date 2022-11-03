public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []arr = {10,9,8,7,4,2,0,-3,-4};
        int target=8;
        System.out.println(search(arr, target));
    }

    static int search(int []arr, int target ){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] > arr[end];
        while( start <= end){
        int mid = start + (end- start)/2;

        if ( arr[mid]== target){
            return mid;
        }

        if (isAsc){
                if( target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                } 
            
        } else {
            
                if( target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                } 
            } return mid;
        } return -1;
    }
}

