package com.mosadchiy.grokking_algorithms;

import java.util.Arrays;

public class RecursionNumOfItems {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 6};
        System.out.println("input array: " + Arrays.toString(array));
        System.out.println("number of items: " + numOfItems(array));
    }

    private static int numOfItems(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return 1 + numOfItems(Arrays.copyOfRange(array, 1, array.length));
    }
}
