package com.gk.datastructures.basics.questions;


public class PositionOfElementInInfiniteArray {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 12, 24, 35, 47, 67, 99, 122}; //it is an infinite array, so it will not give you outofbounds exception
        int target = 12;
        System.out.println(findElement(arr, target));
    }

    private static int findElement(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;  //or 2*end
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
