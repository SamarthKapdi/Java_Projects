package com.rays.exercise.javabasics;
public class PrimesWithBooleanArray {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers between 2 and 100:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) System.out.print(i + " ");
        }
    }
}
