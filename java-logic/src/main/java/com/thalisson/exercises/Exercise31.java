package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("----- Calculadora de média com conceito de nota -----\n");
        System.out.print("\nInforme a primeira nota: ");
        double nDouble = scanner.nextDouble();
        System.out.print("\nInforma a segunda nota: ");
        double n2Double = scanner.nextDouble();

        double media = (nDouble + n2Double) / 2;
        String result = "APROVADO\n";
        String gradeScale = "A";

        if (media <= 9.00 && media >= 7.5) {
            gradeScale = "B";
        } else if (media <= 7.5 && media >= 6.00){
            gradeScale = "C";
        } else if (media <= 6.00 && media >= 4.00) {
            gradeScale = "D";
            result = "REPROVADO\n";
        } else if (media <= 4.00 && media >= 0) {
            gradeScale = "E";
            result = "REPROVADO\n";
        }

        System.out.printf("\nMedia: %.2f", media);
        System.out.printf("\nConceito: %s\n", gradeScale);
        System.out.print(result);
        scanner.close();
    }
}