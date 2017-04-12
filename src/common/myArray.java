package common;

/**
 * Create any size array with random (or not) element, between 0-100
 */
public class myArray {
    public static int[] get (int size) {
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] getRandom (int size) {
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
}
