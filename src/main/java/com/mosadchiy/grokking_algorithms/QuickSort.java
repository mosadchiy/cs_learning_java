package com.mosadchiy.grokking_algorithms;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 2, 10};
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("sorted array: " + Arrays.toString(quickSort(array)));
    }

    private static int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int pivot = array[0];
        int[] lowerValuesArray = new int[]{};
        int[] higherValuesArray = new int[]{};
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pivot) {
                lowerValuesArray = ArrayUtils.add(lowerValuesArray, array[i]);
            } else {
                higherValuesArray = ArrayUtils.add(higherValuesArray, array[i]);
            }
        }
        return ArrayUtils.addAll(
                ArrayUtils.addAll(quickSort(lowerValuesArray), pivot),
                quickSort(higherValuesArray));
    }
}
