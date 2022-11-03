public class Main{

    public static void main(String[] args) {
        int [] arr ={45, 67, 34, 46, 13, 90};
        int target = 46;
        // int ans = (linearSearch(nums, target));
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target)
    {
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // int element = arr[i];
            if (arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}