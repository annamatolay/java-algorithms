package searching;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    // define necessary fields
    private int[] array;
    private int target;
    private int max;
    private int min;
    private int guess;

    private BinarySearch (int[] array, int target) {
        // initialize fields
        this.array = array;
        this.target = target;
        this.max = array.length-1;
        this.min = 0;
        this.guess = 0;
    }

    // count sign the loop steps
    // while the min value doesn't reach the max, the searching will continue
    // (otherwise return -1)
    // if the guessed number is right, return that
    // if not, increase or decrease the min or max value
    // (depend on statements)
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
        // create new int array and fill it
        int[] array = new int[32];
        for (int i = 0; i<array.length; i++) {
            array[i] = i;
        }
        System.out.println("Target array:");
        System.out.println(Arrays.toString(array));

        // get a random target
        Random n = new Random();
        int target = n.nextInt(50) - 10;
        System.out.println("Target number: "+target);

        // let's rock!
        BinarySearch bin = new BinarySearch(array, target);
        System.out.println("Result: " + bin.doSearch());
    }
}
