package com.bridglab;

import java.util.Scanner;

public class PalindromeNumber {
    public void checkPalindrome(int num) {
        int rev=0;
        while (num!=0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (num == rev) {
            System.out.println("Number is Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Palindrome :");
        int num = sc.nextInt();
        PalindromeNumber palindromeNumber =new PalindromeNumber();
        palindromeNumber.checkPalindrome(num);

    }
}
