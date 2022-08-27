package realisation.sort.quick;

public class QuickSort {

    public static int[] quickSortRealisation(int[] nonSortedArray, int firstElement, int lastElement) {

        if (nonSortedArray.length == 0) {
            return nonSortedArray;
        }
        if (firstElement >= lastElement) {
            return nonSortedArray;
        }

        int referenceElement = nonSortedArray[firstElement + (lastElement - firstElement) / 2];
        int leftElementIndex = firstElement;
        int rightElementIndex = lastElement;

        while (leftElementIndex <= rightElementIndex) {

            while (nonSortedArray[leftElementIndex] < referenceElement) {
                leftElementIndex++;
            }

            while (nonSortedArray[rightElementIndex] > referenceElement) {
                rightElementIndex--;
            }

            if (leftElementIndex <= rightElementIndex) {
                int temporaryElement = nonSortedArray[leftElementIndex];
                nonSortedArray[leftElementIndex] = nonSortedArray[rightElementIndex];
                nonSortedArray[rightElementIndex] = temporaryElement;
                leftElementIndex++;
                rightElementIndex--;
            }
        }

        if (firstElement < rightElementIndex) {
            quickSortRealisation(nonSortedArray, firstElement, rightElementIndex);
        }
        if (lastElement > leftElementIndex) {
            quickSortRealisation(nonSortedArray, leftElementIndex, lastElement);
        }
        return nonSortedArray;
    }
}