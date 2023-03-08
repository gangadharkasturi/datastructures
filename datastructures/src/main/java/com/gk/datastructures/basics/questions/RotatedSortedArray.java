package com.gk.datastructures.basics.questions;

public class RotatedSortedArray {
    public static int rotatedSearch() {
        int arr[] = {6, 7, 1, 2, 3, 4, 5,};
        int indexOfPivot = findPivot(arr);
        int numberToFind = 6;
        System.out.println(indexOfPivot);
        int index = findElement(arr, numberToFind, 0, indexOfPivot);
        if (index == -1) {
            index = findElement(arr, numberToFind, indexOfPivot + 1, arr.length - 1);
        }
        System.out.println(index);
        return index;


    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int findElement(int[] arr, int numberToFind, int start, int end) {
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

    public static void main(String[] args) {
        rotatedSearch();
    }
}
