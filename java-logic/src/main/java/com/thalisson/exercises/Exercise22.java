package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Calculadora de média.\n");
        System.out.print("\nDigite a primeira nota: ");
        double nDouble = scanner.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        double n2Double = scanner.nextDouble();
        double average = (nDouble + n2Double) / 2;
        if (average == 10) {
            System.out.print("\nAprovado com Distinção!\n");
        } else if (average >= 7) {
            System.err.println("\nAprovado!\n");
        } else {
            System.out.print("\nReprovado.\n");
        }

        scanner.close();
    }
}