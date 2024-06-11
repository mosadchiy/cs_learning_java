package com.mosadchiy.grokking_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(array));
    }

    private static List<Integer> selectionSort(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<>();
        while (array.size() > 0) {
            int smallestIndex = findSmallestIndex(array);
            sortedArray.add(array.remove(smallestIndex));
        }
        return sortedArray;
    }

    private static int findSmallestIndex(List<Integer> array) {
        int smallest = array.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
