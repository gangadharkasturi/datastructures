package com.gk.datastructures.basics.questions;

/**
 * Here both ascending and descending order logic for binary search has been combined into single method: orderAgnosticBinarySearch
 */
public class FindInMountainArray_2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 9, 15, 20, 10, 8, 6, -1};
        int target = 5;
        int peakIndex = peakIndex(arr);
        int ansIndex = search(peakIndex, arr, target);
        System.out.println("Index Number : " + ansIndex);
    }

    private static int search(int peakIndex, int[] arr, int target) {
        int firstTry = orderAgnosticBinarySearch(arr, 0, peakIndex, target);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBinarySearch(arr, peakIndex + 1, arr.length - 1, target);
        }
    }

    /**
     * @param arr
     * @param start
     * @param end
     * @param target
     * @return
     */
    private static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target) {

        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
