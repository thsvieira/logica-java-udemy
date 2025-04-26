package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de metros para centímetros.\n");
        System.out.print("Digite o valor em metros: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("\nValor em centímetros: %.1f cm\n", nDouble * 100);

        scanner.close();
    }
}