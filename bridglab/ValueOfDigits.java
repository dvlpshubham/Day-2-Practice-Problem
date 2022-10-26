package com.bridglab;

import java.util.Scanner;

public class ValueOfDigits {
    public void checkingValueOfDigits(int num) {
        int hundred = 0;
        int tens = 0;
        int ones = 0;
        if (num <= 999 && num > 99) {
            hundred = num / 100;
            System.out.println("Hundreds place digit: " + hundred);

            tens = (num - (hundred*100)) / 10;
            System.out.println("Tens place digit: " + tens);

            ones = (num - (tens*10) - (hundred*100));
            System.out.println("Ones place digit: " +ones);
        }
        else
        {
            if (num > 999)
                System.out.println("Number more then 3 digits.");
            if (num < 100)
                System.out.println("Number less then 3 digits.");
        }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit num :");
        int num = input.nextInt();
        ValueOfDigits valueOfDigits = new ValueOfDigits();
        valueOfDigits.checkingValueOfDigits(num);

    }
}
