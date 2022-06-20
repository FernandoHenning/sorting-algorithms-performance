

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

    public static void dualPivotQuickSort(int low, int high, int[] array){
        if(low<high){
            int[] pivots = dualPivotPartition(low, high,array);
            dualPivotQuickSort(low, pivots[0]-1, array);
            dualPivotQuickSort(pivots[0]+1, pivots[1]-1, array);
            dualPivotQuickSort(pivots[1]+1, high,array);

        }
    }

    private static int[] dualPivotPartition(int low, int high, int[]array){
        // If value in low is greater than the value in high they are exchanged
        if (array[low]>array[high]) swap(array, low, high);

        int j = low + 1;
        int g = high - 1;
        int k = low + 1;
        int leftPivot = array[low];
        int rightPivot = array[high];

        while (k<=g){
            if (array[k]< leftPivot){
                swap(array, k, j);
                j++;

            } else if (array[k]>=rightPivot) {
                while (array[g]>rightPivot && k<g) g--;
                swap(array, k,g);
                g--;
                if (array[k]<leftPivot){
                    swap(array, k,j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;
        swap(array, low, j);
        swap(array, high, g);

        return new int[] { j, g };
    }
}
