import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0,6,2,4,1,3,7,8};
        int[] bubbleSorted = Algorithms.bubbleSort(array);
        System.out.println("Bubble Sorted");
        System.out.println(Arrays.toString(bubbleSorted));
        int[] selectionSorted = Algorithms.selectionSort(array);
        System.out.println("Selection Sorted");
        System.out.println(Arrays.toString(selectionSorted));

    }
}
