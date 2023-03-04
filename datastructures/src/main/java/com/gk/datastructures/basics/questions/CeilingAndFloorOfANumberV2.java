package com.gk.datastructures.basics.questions;

/**
 * This solution has been built based on binary search
 */
public class CeilingAndFloorOfANumberV2 {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 8, 12, 26, 35, 45, 55, 78, 89};
        int target = -1221;
        int ceilingNumber = ceilingOfANumber(arr, target);
        int floorNumber = floorOfANumber(arr, target);
        System.out.println("Floor : " + floorNumber);
        System.out.println("Ceiling : " + ceilingNumber);
    }

    private static int floorOfANumber(int[] arr, int target) {

        if (target < arr[0]) { //if the element is less than the element in the first position, then it means, element is not found
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }


    private static int ceilingOfANumber(int[] arr, int target) {

        if (target > arr[arr.length - 1]) { //if the element is greater than the element in array, then it means, element is not found
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
