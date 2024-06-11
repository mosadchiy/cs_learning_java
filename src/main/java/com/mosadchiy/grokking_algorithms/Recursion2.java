package com.mosadchiy.grokking_algorithms;

public class Recursion2 {

    public static void main(String[] args) {
        countdown(3);
    }

    private static void countdown(int i) {
        System.out.println(i);
        if (i <= 0) {
            return;
        }
        countdown(i - 1);
    }
}
