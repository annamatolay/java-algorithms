package searching;

import common.myArray;

import java.util.Arrays;
import java.util.Random;

/**
 * Compares the target value to the middle element of the array; if they are unequal,
 * the half in which the target cannot lie is eliminated and the search continues
 * on the remaining half until it is successful or the remaining half is empty.
 * It works on sorted arrays.
 *
 * Average performance: O(log n)
 */
public class BinarySearch {
    private int[] array;
    private int target;
    private int max;
    private int min;
    private int guess;

    private BinarySearch (int[] array, int target) {
        this.array = array;
        this.target = target;
        this.max = array.length-1;
        this.min = 0;
        this.guess = 0;
    }

    private int doSearch() {
        int count = 0;
        while (min <= max) {
            count++;
            guess = (min + max)/2;
            System.out.println("Guess: " + guess + " Count: " + count);
            if (array[guess] == target) {
                return guess;
            }
            else if (array[guess] < target) {
                min = guess + 1;
            }
            else {
                max = guess - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // create new int array with 32 (not random) element
        int[] array = myArray.get(32);
        System.out.println("Target array:\n"+Arrays.toString(array));
        // get a random target (between: -10 - 40)
        Random n = new Random();
        int target = n.nextInt(50) - 10;
        System.out.println("Target number: "+target);
        // let's rock!
        BinarySearch bin = new BinarySearch(array, target);
        System.out.println("Result:\n" + bin.doSearch());
    }
}
