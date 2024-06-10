package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(array);
            sortedArray[i] = array[smallest];
            array[smallest] = Integer.MAX_VALUE;
        }
        return sortedArray;
    }

    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
