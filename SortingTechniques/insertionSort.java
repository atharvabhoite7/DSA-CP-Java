public class insertionSort {
    
    public static void main(String args[]){

        int [] intArray = {20, 35, -15, 0 ,48, 3, 58, 7};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement= intArray[firstUnsortedIndex] ;
            int i; 
            for ( i = firstUnsortedIndex; i > 0 && intArray[i -1]>newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i]=newElement;
        }

        for (int i = 0; i < intArray.length; i++ ){
            System.out.println(intArray[i]);
        }
    }
}
