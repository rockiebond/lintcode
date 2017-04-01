package com.rockie.lintcode;

/**
 * Created by baidu on 16/2/22.
 */
public class Fibonacci {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        if (1 == n) {
            return 0;
        }

        if (2 == n) {
            return 1;
        }

        int[] numbers = new int[n];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[n-1];
    }
}
