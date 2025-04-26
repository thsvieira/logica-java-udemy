package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Cálculo da área de um círculo.\n");
        System.out.print("Digite o raio do círculo em cm: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("\nÁrea do círculo: %.2f cm²\n", pi * (nDouble * nDouble));
        scanner.close();
    }
}