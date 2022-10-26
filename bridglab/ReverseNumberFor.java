package com.bridglab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNumberFor {
    public void reversingNumber(int num) {
        int rev = 0;
        for (;num!= 0; num/=10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reversed Number :" + rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to reverse :");
        int num = input.nextInt();
        ReverseNumberFor reverseNumberFor = new ReverseNumberFor();
        reverseNumberFor.reversingNumber(num);

    }
}
