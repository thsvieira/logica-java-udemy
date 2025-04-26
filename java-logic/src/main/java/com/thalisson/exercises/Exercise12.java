package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua altura em metros: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("\nPeso ideal com base na fórmula (72.7 * altura) - 58: %.2f KG\n", (72.7 * nDouble) - 58);
        scanner.close();
    }
}