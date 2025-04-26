package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de ganho em horas por mês.\n");
        System.out.print("Digite a quantidade de dias do mês atual: ");
        int nInt = scanner.nextInt();
        System.out.print("Digite o valor ganho por mês: ");
        double nDouble = scanner.nextDouble();
        System.out.print("Digite quantas horas você trabalha por dia: ");
        double n2Double = scanner.nextDouble();
        double earningPerDay = nDouble / nInt;
        double earningPerHour = earningPerDay / n2Double;
        System.out.printf("Você ganha R$%.2f por hora.", earningPerHour); 
        scanner.close();
    }
}