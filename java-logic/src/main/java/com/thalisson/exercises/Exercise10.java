package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de Celcius para Fahrenheit.\n");
        System.out.print("Digite o valor em Celcius: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("\nTemperatura convertida em Fahrenheit: %.2f F\n", ((nDouble * 9/5) + 32));
        
        scanner.close();
    }
}