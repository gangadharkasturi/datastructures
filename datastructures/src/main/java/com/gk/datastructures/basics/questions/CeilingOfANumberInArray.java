package com.gk.datastructures.basics.questions;

/**
 * Find ceiling of a number in given array
 * eg: arr[] arr ={ 2,5,10,15,20,25,30,31,35,40,41}
 * target = 34
 * first iteration : middle element -> 25
 * so 34 > 25 , ie need to search right side from position of 25 element
 * so start = mid+1 to end arr.length
 * it will become {30,31,35,40,41}
 * now middle = 31
 * 34>31
 * so again search right side
 * start = mid+1
 * {35,40,41}
 * now middle 40
 * 34< 40
 * so search left side
 * in left side only one element is there 35
 * ie. 34<35, hence element not found..
 * so we can say 35 is the greatest smaller number in the array
 */

/**
 * As the array is sorted , and the steps required to solve this problem is based on reducing the size of the array for better comparison.
 * For this reason we applied binary search.. if element not found, we simply returned the first element of the last array in the iteration...
 */
public class CeilingOfANumberInArray {

    public static void main(String[] args) {
        System.out.println(findCeil());
    }
    public static int findCeil() {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int ceilingElement = 15;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ceilingElement == arr[mid]) {
                return ceilingElement;
            } else if (ceilingElement > arr[mid]) {
                start = mid + 1;
            } else if (ceilingElement < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start]; //If I do not find any element, returning the last array's starting position, means returning smallest greatest element

    }
}
