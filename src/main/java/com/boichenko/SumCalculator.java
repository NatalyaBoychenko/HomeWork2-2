package com.boichenko;

public class SumCalculator {
    public int sum(int n) {
        if (n == 0){
            throw new IllegalArgumentException("Illegal number n: " + n);
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
