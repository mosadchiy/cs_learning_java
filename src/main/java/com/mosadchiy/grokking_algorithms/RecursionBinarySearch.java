package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

import static com.mosadchiy.grokking_algorithms.BinarySearch.generateSortedArray;

public class RecursionBinarySearch {

    public static void main(String[] args) {
        int[] array = generateSortedArray(5);
        int item = 3;
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("item to find: " + item);
        findItemInArrayBinarySearch(array, item);
    }

    private static void findItemInArrayBinarySearch(int[] array, int item) {
        if (array.length == 1) {
            if (array[0] == item) {
                System.out.println("Item found: " + item);
                return;
            }
            return;
        }
        int midIndex = (array.length - 1) / 2;
        findItemInArrayBinarySearch(Arrays.copyOfRange(array, 0, midIndex + 1), item);
        findItemInArrayBinarySearch(Arrays.copyOfRange(array, midIndex + 1, array.length), item);
    }
}
