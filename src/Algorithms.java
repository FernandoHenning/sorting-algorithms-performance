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

    static int[] selectionSort(int[] array){
        int size = array.length;
        for (int i = 0; i < (size - 1); i++) {
            int min_index = i;
            for (int j = i + 1; j < size ; j++) {
                if(array[j] < array[min_index]){
                    min_index += 1;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        return array;
    }


}
