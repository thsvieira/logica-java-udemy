package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("----- Produto mais barato entre 3 produtos -----\n");
        
        System.out.print("\nDigite o valor do 1° produto: ");
        double nDouble = scanner.nextDouble();
        double lowerPrice = nDouble;

        for(int i = 1; i < 3; i++) {
            System.out.printf("Digite o valor do %d° produto: ", i + 1);
            nDouble = scanner.nextDouble();

            if(nDouble < lowerPrice){
                lowerPrice = nDouble;
            }
        }

        System.out.printf("Você deve comprar o produto de menor valor, que custa R$%.2f\n", lowerPrice);
        
        scanner.close();
    }
}