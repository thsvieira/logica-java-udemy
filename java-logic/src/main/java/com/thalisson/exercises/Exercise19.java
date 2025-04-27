package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Verificar se o número é positivo ou negativo.\n\n");
        System.out.print("Digite um número qualquer: ");
        double nDouble = scanner.nextDouble();
        String numberChecked = (nDouble >= 0) ? "positivo" : "negativo";
        System.out.printf("\nO número %.1f é %s.\n", nDouble, numberChecked);
        scanner.close();
    }
}