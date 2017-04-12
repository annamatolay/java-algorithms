package sorting;

import common.myArray;

import java.util.Arrays;

/**
 * is an efficient, general-purpose, comparison-based sorting algorithm. Most implementations produce a stable sort,
 * which means that the implementation preserves the input order of equal elements in the sorted output.
 * Merge sort is a divide and conquer algorithm that was invented by John von Neumann.
 *
 * Average performance: O(n log n)
 */
public class MergeSort {
    private int[] numbers;
    private int[] helper;

    private void sort(int[] values) {
        this.numbers = values;
        int number = values.length;
        this.helper = new int[number];
        mergeSort(0, number - 1);
    }

    private void mergeSort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergeSort(low, middle);
            // Sort the right side of the array
            mergeSort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        System.arraycopy(numbers, low, helper, low, high + 1 - low);

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }

    public static void main(String[] args) {
        // Create an array with 10 random element
        int[] array = myArray.getRandom(30);
        // Let's rock
        System.out.println("Target array:\n"+ Arrays.toString(array));
        MergeSort merge = new MergeSort();
        merge.sort(array);
        System.out.println("Result:\n"+Arrays.toString(array));
    }
}
