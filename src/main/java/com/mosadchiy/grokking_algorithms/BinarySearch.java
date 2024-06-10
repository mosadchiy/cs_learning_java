package com.mosadchiy.grokking_algorithms;

import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = generateSortedArray(1000000000);
        int item = 1000000000;
        System.out.println("=========================");
        findItemInArraySimpleSearch(array, item);
        System.out.println("=========================");
        findItemInArrayBinarySearch(array, item);
    }

    private static void findItemInArraySimpleSearch(int[] array, int item) {
        int numOfOperations = 0;
        boolean itemFound = false;
        long searchStartTime = System.currentTimeMillis();

        for (int arrayItem : array) {
            numOfOperations++;
            if (arrayItem == item) {
                itemFound = true;
                break;
            }
        }

        long searchEndTime = System.currentTimeMillis();

        System.out.println("Item found: " + itemFound);
        System.out.println("Simple search took: " + (searchEndTime - searchStartTime));
        System.out.println("Number of operations: " + numOfOperations);
    }

    private static void findItemInArrayBinarySearch(int[] array, int item) {
        int numOfOperations = 0;
        boolean itemFound = false;
        long searchStartTime = System.currentTimeMillis();

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            numOfOperations ++;
            int midIndex = (lowIndex + highIndex) / 2;
            int arrayItem = array[midIndex];
            if (arrayItem == item) {
                itemFound = true;
                break;
            }
            if (arrayItem > item) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }

        long searchEndTime = System.currentTimeMillis();

        System.out.println("Item found: " + itemFound);
        System.out.println("Simple search took: " + (searchEndTime - searchStartTime));
        System.out.println("Number of operations: " + numOfOperations);
    }

    private static int[] generateSortedArray(int arraySize) {
        int[] newArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }

    private static int[] generateRandomArray(int arraySize) {
        int[] newArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = random.nextInt(arraySize);
        }
        return newArray;
    }
}
