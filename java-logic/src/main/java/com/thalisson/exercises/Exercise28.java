package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Calculadora de reajuste de salário.\n");
        System.out.print("\nInforme o seu salário atual: ");
        double nDouble = scanner.nextDouble();
        double adjustedSalary = 0;
        int risePercent = 0;
        double rise = 0;

        if(nDouble <= 280.00){
            risePercent = 20;
            rise = nDouble * 0.2;
            adjustedSalary = nDouble  + rise;
        } else if (nDouble <= 700.00){
            risePercent = 15;
            rise = nDouble * 0.15;
            adjustedSalary = nDouble + rise;
        } else if (nDouble <= 1500.00) {
            risePercent = 10;
            rise = nDouble * 0.1;
            adjustedSalary = nDouble + rise;
        } else {
            risePercent = 5;
            rise = nDouble * 0.05;
            adjustedSalary = nDouble + rise;
        }

        System.out.printf("\nSalário antes do reajuste: %.2f", nDouble);
        System.out.printf("\nPercentual de aumento aplicado: %d", risePercent);
        System.out.printf("\nValor do aumento: %.2f", rise);
        System.out.printf("\nSalário depois do reajuste: %.2f\n", adjustedSalary);
        scanner.close();
    }
}