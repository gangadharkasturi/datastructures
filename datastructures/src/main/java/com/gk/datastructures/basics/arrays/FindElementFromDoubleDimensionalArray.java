package com.gk.datastructures.basics.arrays;

public class FindElementFromDoubleDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 3, 56},
                {99, 42, 445, 87, 12},
                {87, 43, 4, 9, 8}
        };
        int numberToFind = 43;
        System.out.println(findNumber(arr, numberToFind));
    }

    private static boolean findNumber(int[][] arr, int numberToFind) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == numberToFind) {
                    return true;
                }
            }
        }
        return false;

    }
}
