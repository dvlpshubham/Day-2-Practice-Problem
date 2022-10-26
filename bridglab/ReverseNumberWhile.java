package com.bridglab;

import java.util.Scanner;

public class ReverseNumberWhile {
    public void performingReverseorder(int num) {
        int rev=0;
        while (num!=0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to reverse :");
        int num = input.nextInt();
        ReverseNumberWhile reverseNumber = new ReverseNumberWhile();
        reverseNumber.performingReverseorder(num);

    }
}
