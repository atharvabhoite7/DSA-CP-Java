public class selectionSort {
    public static void main(String args[])
    {
        int [] arr = {20, 35, -125, 0 ,48, 3, 58, 7};
        
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }       
        
        for (int i =0; i < arr.length ; i++)
        System.out.println(arr[i]);
    }

    public static void swap(int [] arr, int i, int j)
    {
        if(i == j) return ;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        
    }
}
