import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] array = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        int size = array.length;
        long reference=System.nanoTime();
        Algorithms.dualPivotQuickSort(0, size-1, array);
        long finishm=System.nanoTime();
        System.out.println( "Dual Pivot QuickSort [100 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();

        reference=System.nanoTime();
        Algorithms.quickSort(0, size-1, array);
        finishm=System.nanoTime();
        System.out.println( "QuickSort [100 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        reference=System.nanoTime();
        Algorithms.bubbleSort(array);
        finishm=System.nanoTime();
        System.out.println( "Bubble Sort [100 elements]:: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        reference=System.nanoTime();
        Algorithms.selectionSort(array);
        finishm=System.nanoTime();
        System.out.println( "Selection Sort [100 elements]:  "+( (double)(finishm-reference) )/1000000000.0);

        // ######################### THOUSAND ELEMENTS ###################################################
        array = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
        size = array.length;
        reference=System.nanoTime();
        Algorithms.dualPivotQuickSort(0, size-1, array);
        finishm=System.nanoTime();
        System.out.println( "Dual Pivot QuickSort [1,000 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();

        reference=System.nanoTime();
        Algorithms.quickSort(0, size-1, array);
        finishm=System.nanoTime();
        System.out.println( "QuickSort [1,000 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();

        reference=System.nanoTime();
        Algorithms.bubbleSort(array);
        finishm=System.nanoTime();
        System.out.println( "Bubble Sort [1,000 elements]:: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();

        reference=System.nanoTime();
        Algorithms.selectionSort(array);
        finishm=System.nanoTime();
        System.out.println( "Selection Sort [1,000 elements]:  "+( (double)(finishm-reference) )/1000000000.0);

        // ######################### TEN THOUSAND ELEMENTS ###################################################
        array = IntStream.generate(() -> new Random().nextInt(10_000)).limit(10_000).toArray();
        size = array.length;
        reference=System.nanoTime();
        Algorithms.dualPivotQuickSort(0, size-1, array);
        finishm=System.nanoTime();
        System.out.println( "Dual Pivot QuickSort [10,000 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(10_000)).limit(10_000).toArray();

        reference=System.nanoTime();
        Algorithms.quickSort(0, size-1, array);
        finishm=System.nanoTime();
        System.out.println( "QuickSort [10,000 elements]: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(10_000)).limit(10_000).toArray();

        reference=System.nanoTime();
        Algorithms.bubbleSort(array);
        finishm=System.nanoTime();
        System.out.println( "Bubble Sort [10,000 elements]:: "+( (double)(finishm-reference) )/1000000000.0);

        array = IntStream.generate(() -> new Random().nextInt(10_000)).limit(10_000).toArray();

        reference=System.nanoTime();
        Algorithms.selectionSort(array);
        finishm=System.nanoTime();
        System.out.println( "Selection Sort [10,000 elements]:  "+( (double)(finishm-reference) )/1000000000.0);



    }
}