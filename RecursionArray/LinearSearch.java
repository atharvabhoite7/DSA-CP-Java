public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 6, 8};
        System.out.println(findIndex(arr,0, 5));
    }

    static boolean find(int[] arr, int index, int target){
        if( index ==arr.length){
            return false;
        }
        return target == arr[index] || find(arr,index+1,target);
    }

    static int findIndex(int[] arr, int index, int target){
        if( index == arr.length){
            return -1;
        }

        if(target == arr[index]){
            return arr[index];
        }
         else {
             return findIndex(arr,index+1,target);
         }
    }
}
