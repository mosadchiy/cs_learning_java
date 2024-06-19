package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

public class RecursionMaxNumber {

    public static void main(String[] args) {
        int[] array = new int[]{9, 4, 6, 5};
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("max number: " + max(array));
    }

    private static int max(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        int arrayMax = max(Arrays.copyOfRange(array, 1, array.length));
        if (max >= arrayMax) {
            return max;
        } else {
            return arrayMax;
        }
    }
}
