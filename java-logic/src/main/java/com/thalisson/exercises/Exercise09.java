package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de temperatura Fahrenheit para Celcius.\n");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double nDouble = scanner.nextDouble();
        System.out.printf("Temperatura em Celcius: %.2f C", 5 * ((nDouble - 32) / 9));
        scanner.close();
    }
}