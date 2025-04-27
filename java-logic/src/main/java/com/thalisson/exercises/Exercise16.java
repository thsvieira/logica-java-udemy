package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculadora de cobertura de pintura.\n");
        System.out.print("\nInforme o tamanho da área em m²: ");
        double nDouble = scanner.nextDouble();
        double paintCoverLiterPerM2 = nDouble / 3;
        int paintGalonValue = 80;
        double paintGalonLiter = 18;
        int quantityGalon = (int) Math.ceil(paintCoverLiterPerM2 / paintGalonLiter);
        double totalCost = quantityGalon * paintGalonValue;
        System.out.printf("\nQuantidade de latas necessárias para cobertura: %d", quantityGalon);
        System.out.printf("\nCusto total: R$%.2f\n", totalCost);
        scanner.close();
    }
}