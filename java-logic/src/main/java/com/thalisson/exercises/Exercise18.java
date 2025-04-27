package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Comparando maior número.\n\n");
        System.out.print("Digite o primeiro número: ");
        double nDouble = scanner.nextDouble();
        System.out.print("\nDigite o segundo número: ");
        double n2Double = scanner.nextDouble();

        double higherNumber = (nDouble > n2Double) ? nDouble : n2Double;
        System.out.printf("\n%.1f é o maior número.\n", higherNumber);
        scanner.close();
    }
}