package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de salário e contribuições.\n");
        System.out.print("Digite o valor ganho por mês: ");
        double nDouble = scanner.nextDouble();
        double incomeTaxAmount = nDouble * 0.11;
        double inssTaxAmount = nDouble * 0.08;
        double syndicateTaxAmount = nDouble * 0.05;
        double totalEarning = nDouble - incomeTaxAmount - inssTaxAmount - syndicateTaxAmount;
        System.out.printf("\nSalário bruto: %.2f", nDouble);
        System.out.printf("\nImposto de Renda: %.2f", incomeTaxAmount);
        System.out.printf("\nINSS: %.2f", inssTaxAmount);
        System.out.printf("\nSindicato: %.2f", syndicateTaxAmount);
        System.out.printf("\nSalário líquido: %.2f", totalEarning);
        scanner.close();
    }
}