package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------ Calculadora de folha de pagamento ------\n");
        System.out.print("\nDigite o valor ganho por mês: ");
        double nDouble = scanner.nextDouble();
        int incomeTaxAmount = 0;
        double incomeTaxAmountPercent = 0;
        double inssTaxAmount = nDouble * 0.1;
        double syndicateTaxAmount = nDouble * 0.03;
        double fgtsContribuition = nDouble * 0.11;

        if (nDouble > 900.00 && nDouble <= 1500.00) {
            incomeTaxAmount = 5;
            incomeTaxAmountPercent = 0.05;
        } else if (nDouble > 1500.00 && nDouble <= 2500.00) {
            incomeTaxAmount = 10;
            incomeTaxAmountPercent = 0.10;
        } else if (nDouble > 2500.00) {
            incomeTaxAmount = 20;
            incomeTaxAmountPercent = 0.20;
        }        

        double totalDiscount = (nDouble * incomeTaxAmountPercent) + inssTaxAmount + syndicateTaxAmount;
        double totalEarning = nDouble - totalDiscount;

        System.out.printf("\nSalário bruto: %.2f", nDouble);
        System.out.printf("\n(-) IR  (%d%%): %.2f", incomeTaxAmount, incomeTaxAmount != 0 ? nDouble * incomeTaxAmountPercent : 0);
        System.out.printf("\n(-) INSS (10%%): %.2f", inssTaxAmount);
        System.out.printf("\n(-) Sindicato (3%%): %.2f", syndicateTaxAmount);
        System.out.printf("\nFGTS (11%%): %.2f", fgtsContribuition);
        System.out.printf("\nTotal de descontos: %.2f", totalDiscount);
        System.out.printf("\nSalário líquido: %.2f\n", totalEarning);
        
        scanner.close();
    }
}