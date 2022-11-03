public class Max {
    public static void main(String[] args) {
        int [] arr = {};
        System.out.println(maxRange(arr, 2,4));

    }

//     static int max(int [] arr)
//    { int maxVal = arr[0];
//         for  (int i=1; i<arr.length;i++){
//             if( arr[i]>maxVal){
//                 maxVal=arr[i];
//             }
//         }
//         return maxVal;
// }

static int maxRange(int [] arr, int start, int end)
{ int maxVal = arr[0];

    if (end > start){
        return -1;
    }

    if (arr.length==0){
            return -2;
        }
    
     for  (int i=start; i<end;i++){
         if( arr[i]>maxVal){
             maxVal=arr[i];
         }
     }
     return maxVal;
}
}
