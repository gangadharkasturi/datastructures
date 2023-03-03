package com.gk.datastructures.basics.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = {1, 324, 453, 452, 323, 345, 435, 21, 34, 45, 23, 243};
        int numberToFind = 45;
        int index = findNumber(arr, numberToFind);
        System.out.println("Element found at: " + index);
    }

    private static int findNumber(int[] arr, int numberToFind) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

}
