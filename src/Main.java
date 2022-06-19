import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0,6,2,4,1,3,7,8};
        int size = array.length;
        Algorithms.quickSort(0, size-1, array);
        System.out.println(Arrays.toString(array));

    }
}