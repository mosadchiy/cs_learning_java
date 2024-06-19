package com.mosadchiy.grokking_algorithms;

public class RecursionFactorial {

    public static void main(String[] args) {
        int num = 3;
        System.out.println("input number: " + num);
        System.out.println("factorial: " + fact(num));
    }

    private static int fact(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fact(x - 1);
    }
}
