

public class Algorithms {

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int[] bubbleSort(int[] array){
        int size = array.length;
        boolean swapped = false;
        //  iterate through each element
        // 
        for (int i = 0; i < (size-1); i++) {
            // Adjacent elements
            for (int j = 0; j < (size-i-1); j++) {
                if (array[j] > array[j + 1]){
                    swapped = true;
                    swap(array, j, j+1);
                }
            }
            //  array already sorted
            if(!swapped){
                break;
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        int size = array.length;
        for (int i = 0; i < (size - 1); i++) {
            int min_index = i;
            for (int j = i + 1; j < size ; j++) {
                if(array[j] < array[min_index]){
                    min_index += 1;
                }
            }
            swap(array,i,min_index);
        }
        return array;
    }

    public static void quickSort(int low, int high, int[] array){
        if(low<high){
            int j = quickSortPartition(low, high,array);
            quickSort(low, j, array);
            quickSort(j+1, high, array);
        }
    }
    private static int quickSortPartition(int low, int high, int[] array){
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i<j){
            do {
                i++;
            }while (array[i]<=pivot);
            do {
                j--;
            }while (array[j]>pivot);
            if(i<j){
                swap(array, i,j);
            }
        }
        swap(array, low, j);
        return j;
    }
}
