package com.rays.exercise.javabasics;
public class MaxInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 11, 6};
        System.out.println("Largest number is: " + findMax(numbers));
    }
}
