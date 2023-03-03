package com.gk.datastructures.basics.arrays;


/**
 * Find customer with richest wealth
 * int accounts[][] = {
 * {1,2},
 * {7,3},
 * {3,5}
 * };
 * 1st customer : 1+2 = 3
 * 2nd customer : 7+3 = 10;
 * 3rd customer: 3+5 = 8;
 * so richest is 2nd customer
 */
public class CustomerWithRichestWealth {

    public static void main(String[] args) {
        int accounts[][] = {
                {1, 2},
                {7, 3},
                {3, 5}
        };

        int max = 0;
        int customerNumber = 0;
        for (int row = 0; row < accounts.length; row++) {
            int count = 0; //to count
            customerNumber = row; // to hold which row is executing, i.e. which customer is executing
            for (int col = 0; col < accounts[row].length; col++) {
                count = count + accounts[row][col];
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println("Customer No : " + customerNumber + " is having highest wealth :: " + max);
    }
}
