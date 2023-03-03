package com.gk.datastructures.basics.binarysearch;


/**
 * Array must be in sorted order for binary search
 * Now using descending order array.
 * Code will be different for ascending and descending arrays.
 */
public class BinarySearch2 {
    public static void main(String[] args) {
        int arr[] = {990, 543, 443, 312, 100, 85, 84, 43, 32, 16, 1};
        int numberToFind = 84;
        int elementFoundAt = binarySearch(arr, numberToFind);
        System.out.println(elementFoundAt);
    }

    private static int binarySearch(int[] arr, int numberToFind) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (numberToFind == arr[midIndex]) {
                return midIndex;
            } else if (numberToFind > arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (numberToFind < arr[midIndex]) {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
