import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    private static int[] sort (int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length-1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i<lastUnsorted; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(BubbleSort.sort(array)));

    }
}
