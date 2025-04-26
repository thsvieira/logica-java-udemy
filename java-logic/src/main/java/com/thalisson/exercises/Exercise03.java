package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Soma de dois números.\n\n Digite o primeiro número: ");
        double nDouble = scanner.nextDouble();
        System.out.println("\nDigite o segundo número: ");
        double n2Double = scanner.nextDouble();
        System.out.printf("A soma de %.1f + %.1f é %.1f", nDouble, n2Double, nDouble + n2Double);
        scanner.close();
    }
}