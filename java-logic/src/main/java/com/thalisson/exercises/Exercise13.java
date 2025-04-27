package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cálculo de IMC.\n\n");
        System.out.print("Digite o número de uma das opções: ");
        System.out.print("\n1. Homem \n2. Mulher \n\n");
        int nInt = scanner.nextInt();
        System.out.print("\nInforme sua altura em metros: ");
        double nDouble = scanner.nextDouble();
        if(nInt == 1){
            System.out.printf("Peso ideal: %.2f KG\n", (72.7 * nDouble) - 58);
        } else {
            System.out.printf("Peso ideal: %.2f KG\n", (62.1 * nDouble) - 44.7);
        }
        scanner.close();
    }
}