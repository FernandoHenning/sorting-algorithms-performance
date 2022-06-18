public class Algorithms {

    static int[] bubbleSort(int[] array){
        int size = array.length;
        boolean swapped = false;
        //  iterate through each element
        // 
        for (int i = 0; i < (size-1); i++) {
            // Adjacent elements
            for (int j = 0; j < (size-i-1); j++) {
                if (array[j] > array[j + 1]){
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            //  array already sorted
            if(!swapped){
                break;
            }
        }
        return array;
    }
}
