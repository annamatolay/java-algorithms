package sorting;

import common.myArray;

import java.util.Arrays;

/**
 * Is a simple sorting algorithm that repeatedly steps through the list to be sorted,
 * compares each pair of adjacent items and swaps them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 * The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble"
 * to the top of the list. Although the algorithm is simple, it is too slow and impractical for most problems.
 * It can be practical if the input is usually in sorted order but may occasionally
 * have some out-of-order elements nearly in position.
 *
 * Average performance: O(n^2)
 */
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
        // create new array with 10 random number
        int[] array = myArray.getRandom(10);
        // let's rock
        System.out.println("Target array:\n"+Arrays.toString(array));
        System.out.println("Result:\n"+Arrays.toString(BubbleSort.sort(array)));

    }
}
