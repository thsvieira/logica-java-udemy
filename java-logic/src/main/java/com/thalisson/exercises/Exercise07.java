package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo do dobro da área de um quadrado");
        System.out.print("Digite um dos lados do quadrado em cm: ");
        double nDouble = scanner.nextDouble();
        double area = nDouble * nDouble;
        System.out.printf("Dobro da área do quadrado: %.2f cm²", area * 2);
        scanner.close();
    }
}