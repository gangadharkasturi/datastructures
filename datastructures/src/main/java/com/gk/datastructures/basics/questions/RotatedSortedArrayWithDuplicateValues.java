package com.gk.datastructures.basics.questions;

public class RotatedSortedArrayWithDuplicateValues {
    public static int rotatedSearch() {
        int arr[] = {6, 7, 1, 2, 3, 4, 5, 6};
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
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                //NOTE: we are skipping the elements, but what if the element is pivot..?
                //so check first if it is pivot or not
                if (arr[start] > arr[start + 1]) {
                    return start; //then it is pivot
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
