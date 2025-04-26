package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int nInt = scanner.nextInt();
        System.out.print("Digite mais um número inteiro: ");
        int n2Int = scanner.nextInt();
        System.out.print("Digite um número real: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("\nProduto do dobro do primeiro número com metade do segundo número: %.2f\n", (nInt * 2) * ((double)n2Int / 2));
        System.out.printf("\nSoma do triplo do primeiro número com o terceiro número: %.2f\n", (nInt * 3) + nDouble);
        System.out.printf("\nTerceiro número elevado ao cubo: %.2f\n", Math.pow(nDouble, 3));
        scanner.close();
    }
}