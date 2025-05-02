package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\n------ Identificar tipo de triângulo ------\n\n");
        System.err.print("Informe um dos lados do triângulo: ");
        double nDouble = scanner.nextDouble();
        System.out.print("\nInforme um dos outros lados do triângulo: ");
        double n2Double = scanner.nextDouble();
        System.out.print("\nInforme o último lado restante do triângulo: ");
        double n3Double = scanner.nextDouble();

        boolean isATriangle = ((nDouble + n2Double) > n3Double) && ((nDouble + n3Double) > n2Double) && ((n2Double + n3Double) > nDouble);
        boolean isEquilateralTriangle = nDouble == n2Double && nDouble == n3Double;
        boolean isIsoscelesTriangle = nDouble == n2Double || nDouble == n3Double || n2Double == n3Double;
        boolean isScaleneTriangle = nDouble != n2Double && nDouble != n3Double && n2Double != n3Double;

        if (isATriangle) {
            if (isEquilateralTriangle){
                System.out.print("\nTriângulo Equilátero.\n");
            } else if (isIsoscelesTriangle){
                System.out.print("\nTriângulo Isósceles.\n");
            } else if (isScaleneTriangle) {
                System.out.print("\nTriangulo Escaleno.\n");
            }
        } else {
            System.err.println("\nValores informados não correspondem a um triângulo.");
        }
        scanner.close();
    }
}