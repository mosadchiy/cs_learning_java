package com.mosadchiy.grokking_algorithms;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 2, 10};
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("sorted array: " + Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        int[] sortedArray = new int[]{};
        while (array.length > 0) {
            int smallestItemIndex = findSmallest(array);
            sortedArray = ArrayUtils.add(sortedArray, array[smallestItemIndex]);
            array = ArrayUtils.remove(array, smallestItemIndex);
        }
        return sortedArray;
    }

    private static int findSmallest(int[] array) {
        int smallestIndex = 0;
        int smallestItem = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestItem) {
                smallestItem = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
