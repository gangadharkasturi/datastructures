package com.gk.datastructures.basics.arrays;

public class SearchInRange {

    public static void main(String[] args) {
        int arr[] = {1, 3, 34, 34, 54, 546, 65, 23, 121, 2, 999, 3323, 988};
        int startIndex = 4;
        int endIndex = 9;
        int elementToFind = 121;
        int foundAt = searchInRange(arr, elementToFind, startIndex, endIndex);
        System.out.println("Element found at : " + foundAt);
    }

    private static int searchInRange(int[] arr, int elementToFind, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }
}
