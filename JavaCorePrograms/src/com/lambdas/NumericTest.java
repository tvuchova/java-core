package com.lambdas;


public class NumericTest {
    interface Numeric {
        boolean computeTest(int n);
    }

    public static void main(String args[]) {
        Numeric isEven = (n) -> (n % 2) == 0;
        Numeric isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));

    }

}

