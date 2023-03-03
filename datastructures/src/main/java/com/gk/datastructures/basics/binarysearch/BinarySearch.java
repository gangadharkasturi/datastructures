package com.gk.datastructures.basics.binarysearch;

/**
 * Array must be in sorted order to apply binary search.
 * Current implementation is having ascending order array
 *  * Code will be different for ascending and descending arrays.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 12, 15, 32, 54, 78, 90};
        int numberToFind = 5;
        int elementIndex = findElement(arr, numberToFind);
        System.out.println(elementIndex);

    }

    private static int findElement(int[] arr, int numberToFind) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //or (start+end)/2
            if (numberToFind < arr[mid]) {
                end = mid - 1;
            } else if (numberToFind > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
