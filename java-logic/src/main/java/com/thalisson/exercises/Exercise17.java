package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do arquivo em megabytes (MB): ");
        double nDouble = scanner.nextDouble();
        System.out.print("\nInforme a velocidade da sua internet em megabytes por segundo (Mbps): ");
        double n2Double = scanner.nextDouble();
        double downloadTime = (nDouble / n2Double) / 60; 
        System.out.printf("Tempo estimado para download em minutos: %.2f\n", downloadTime);
        scanner.close();
    }
}