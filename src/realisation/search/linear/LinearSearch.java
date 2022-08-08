package realisation.search.linear;


public class LinearSearch {

    public static int findElement(int[] intArray, int keyElement) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == keyElement) {
                return i;
            }
        }
        return -1;
    }
}