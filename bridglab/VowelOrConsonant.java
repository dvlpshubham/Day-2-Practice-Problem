package com.bridglab;

import java.util.Scanner;

class VowelOrConsonant {

    public void checkVowelOrConsonant(char ch) {
        switch (ch) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println(ch + " is a Vowel.");
                break;

            default:
                System.out.println(ch + " is a Non-Vowel Character.");

        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Character :");
        char ch=sc.next().charAt(0);

        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.checkVowelOrConsonant(ch);

    }

}
