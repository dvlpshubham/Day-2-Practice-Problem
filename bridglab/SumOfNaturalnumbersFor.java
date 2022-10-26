package com.bridglab;

import java.util.Scanner;

public class SumOfNaturalnumbersFor {
    public void calculatingSumOfNaturalNumbers(int num) {
        int temp = 0;
        for (int i=1;i<=num;i++) {
            temp = temp + i;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        SumOfNaturalnumbersFor sumOfNaturalnumbersfor = new SumOfNaturalnumbersFor();
        sumOfNaturalnumbersfor.calculatingSumOfNaturalNumbers(num);
    }
}
