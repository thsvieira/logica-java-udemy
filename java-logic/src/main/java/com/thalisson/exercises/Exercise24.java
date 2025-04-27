package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---- Encontrar o maior e menor valor entre 3 números ----\n");

        System.out.print("\nDigite o 1° número: ");
        double nDouble = scanner.nextDouble();
        double higherNumber = nDouble;
        double lowerNumber = nDouble;
        for (int i = 1; i < 3; i++) { 
            System.out.printf("\nDigite o %d° número: ", i + 1);
            nDouble = scanner.nextDouble();
            if (nDouble > higherNumber) {
                higherNumber = nDouble;
            }
            if (nDouble < lowerNumber) {
                lowerNumber = nDouble;
            }
        }

        System.out.printf("\n%.2f é o maior número entre os 3 informados.\n", higherNumber);
        System.out.printf("%.2f é o menor número entre os 3 informados.\n", lowerNumber);
        
        scanner.close();
    }
}
