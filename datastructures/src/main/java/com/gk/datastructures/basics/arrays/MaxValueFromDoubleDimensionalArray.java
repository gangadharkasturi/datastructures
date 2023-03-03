package com.gk.datastructures.basics.arrays;

public class MaxValueFromDoubleDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 3, 56},
                {99, 42, 445, 87, 12},
                {87, 43, 4, 9, 8}
        };
        System.out.println(findMax(arr));

    }

    private static int findMax(int[][] arr) {
        int max = 0; //assume
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
