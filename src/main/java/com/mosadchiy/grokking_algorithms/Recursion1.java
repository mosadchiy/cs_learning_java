package com.mosadchiy.grokking_algorithms;

public class Recursion1 {

    public static void main(String[] args) {
        countdown(3);
    }

    private static void countdown(int i) {
        System.out.println(i);
        countdown(i - 1);
    }
}
