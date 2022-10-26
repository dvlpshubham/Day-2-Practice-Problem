package com.bridglab;

import java.util.Scanner;

public class SumOfNaturalNumbersWhile {
    public void clculatingSum(int num) {
        int i = 1;
        int sum = 0;
        while(i <= num)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        SumOfNaturalNumbersWhile sumOfNaturalNumbersWhile = new SumOfNaturalNumbersWhile();
        sumOfNaturalNumbersWhile.clculatingSum(num);
    }
}
