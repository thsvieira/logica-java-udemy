package com.thalisson.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char nChar = scanner.nextLine().toUpperCase().charAt(0);
        List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');

        String charType = vowels.contains(nChar) ? "vogal" : "consonte";
        System.out.printf("\n%s é uma %s.\n", nChar, charType);
        scanner.close();
    }
}