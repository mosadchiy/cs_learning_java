package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

import static com.mosadchiy.grokking_algorithms.BinarySearch.generateSortedArray;

public class RecursionBinarySearch {

    public static void main(String[] args) {
        int[] array = generateSortedArray(10);
        int item = 4;
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("item to find: " + item);
        findItemInArrayBinarySearch(array, item);
    }

    private static void findItemInArrayBinarySearch(int[] array, int item) {
        if (array.length == 0) {
            return;
        }
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int midIndex = (lowIndex + highIndex) / 2;
        int arrayItem = array[midIndex];
        if (arrayItem == item) {
            System.out.println("Item found: " + item);
            return;
        }
        if (arrayItem > item) {
            findItemInArrayBinarySearch(Arrays.copyOfRange(array, lowIndex, midIndex), item);
        } else {
            findItemInArrayBinarySearch(Arrays.copyOfRange(array, midIndex + 1, highIndex + 1), item);
        }
    }
}
