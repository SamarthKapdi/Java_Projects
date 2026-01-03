package com.rays.exercise.javabasics;
public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 8, 30};
        System.out.println("Second largest number is: " + findSecondLargest(numbers));
    }
}
