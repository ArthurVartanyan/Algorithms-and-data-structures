package realisation.sort.selection;

public class SelectionSort {

    /**
     * Low to high realisation
     * @param nonSortedArray - array for sort
     * @return - sorted array
     */
    public static int[] selectionSortRealisation(int[] nonSortedArray) {
        int maxElement;
        int actualArrayLength = nonSortedArray.length;
        for (int i = 0; i < actualArrayLength;) {
            maxElement = nonSortedArray[i];
            int moveTo = i;
            for (int x = 0; x < actualArrayLength; x++) {
                if (nonSortedArray[x] > maxElement) {
                    maxElement = nonSortedArray[x];
                    moveTo = x;
                }
            }
            int elementForMove = nonSortedArray[actualArrayLength - 1];
            nonSortedArray[moveTo] = elementForMove;
            nonSortedArray[actualArrayLength - 1] = maxElement;
            actualArrayLength = actualArrayLength - 1;
        }
        return nonSortedArray;
    }
}