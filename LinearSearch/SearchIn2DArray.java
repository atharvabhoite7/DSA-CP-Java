import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {{23, 45, 78},
        {34, 56, 98,77},
        {12, 93, 41},
        {26, 90, 67, 41}
    };
    int target = 67;
    int [] ans = find(arr, target);
    System.out.println(Arrays.toString(ans));    
}

    static int [] find(int [][] arr, int target){


        

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int [] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
