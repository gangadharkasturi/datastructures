package com.gk.datastructures.basics.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isArmstrong(number));
    }

    private static boolean isArmstrong(int number) {

        int sum = 0;
        int temp = number;
        while (number != 0) { //n=153
            int reminder = number % 10; // r = 3
            sum = sum + (reminder * reminder * reminder);
            number = number / 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }

    }
}
