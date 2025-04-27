package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("---- Encontrar o maior valor entre 3 números ----\n");
        double higherNumber =  0;
        for (int i = 0; i < 3; i++){
            System.out.printf("\nDigite o %d° número: ", i+1);
            double nDouble = scanner.nextDouble();
            if (nDouble > higherNumber || nDouble < 0) {
                higherNumber = nDouble;
            }
        }
        
        System.out.printf("\n%.2f é o maior número entre os 3 informados.\n", higherNumber);
        scanner.close();
    }
}