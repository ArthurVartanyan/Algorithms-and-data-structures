package realisation.search.binary;

public class BinarySearch {

    public static int findElement(int[] sortedArray, int keyElement) {
        int middleElementIndex = sortedArray.length / 2;
        int firstElementIndex;
        int lastElementIndex = sortedArray.length - 1;
        do {
            if (sortedArray[middleElementIndex] > keyElement) {
                lastElementIndex = middleElementIndex;
                middleElementIndex = (lastElementIndex + 1) / 2;
            }
            if (sortedArray[middleElementIndex] < keyElement) {
                firstElementIndex = middleElementIndex;
                middleElementIndex = ((lastElementIndex + firstElementIndex) + 1) / 2;
            }
            if (sortedArray[middleElementIndex] == keyElement) {
                return middleElementIndex;
            }
        }
        while (sortedArray[middleElementIndex] != keyElement);
        return -1;
    }
}