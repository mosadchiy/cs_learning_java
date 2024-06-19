package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

public class RecursionSumFunction {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 5};
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("sum of elements: " + sum(array));
    }

    private static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }
}
