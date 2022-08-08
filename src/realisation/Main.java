package realisation;

import realisation.search.binary.BinarySearch;
import realisation.search.linear.LinearSearch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Thread(Main::runBinarySearch).start();
        new Thread(Main::runLinearSearch).start();

    }


    public static void runBinarySearch() {
        int[] array = Arrays.stream(generateIntArray(1000000, 5)).sorted().toArray();
        System.out.println(BinarySearch.findElement(array, 5));
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
            array[i] = random.nextInt();
        }
        array[array.length - 1] = keyValue;
        return array;
    }
}