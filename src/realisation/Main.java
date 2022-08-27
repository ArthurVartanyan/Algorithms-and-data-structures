package realisation;

import realisation.search.binary.BinarySearch;
import realisation.search.linear.LinearSearch;
import realisation.sort.quick.QuickSort;
import realisation.sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    public static void runQuickSort() {
        int[] array = generateIntArray(6, 5);
        System.out.println(Arrays.toString(Arrays
                .stream(QuickSort.quickSortRealisation(array, 0, array.length - 1)).toArray()));
    }

    public static void runSelectionSort() {
        int[] array = generateIntArray(10, 5);
        System.out.println(Arrays.toString(Arrays.stream(SelectionSort.selectionSortRealisation(array)).toArray()));
    }

    public static void runBinarySearch() {
        int[] array = Arrays.stream(generateIntArray(1000, 5)).sorted().toArray();
        System.out.println(BinarySearch.binarySearch(array, 5));
    }

    public static void runLinearSearch() {
        int keyValue = 5;
        int[] elementsArray = generateIntArray(1000000, keyValue);
        System.out.println(LinearSearch.findElement(elementsArray, keyValue));
    }

    public static int[] generateIntArray(int length, int keyValue) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() / 100000;
        }
        array[array.length - 1] = keyValue;
        return array;
    }
}