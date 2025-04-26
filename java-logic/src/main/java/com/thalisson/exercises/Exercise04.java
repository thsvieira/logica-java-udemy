package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Média de notas.\n");
        System.out.print("Digite a nota do primeiro bimestre: ");
        double nDouble = scanner.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double n2Double = scanner.nextDouble();
        System.out.print("Digite a nota do terceiro bimestre: ");
        double n3Double = scanner.nextDouble();
        System.out.print("Digite a nota do quarto bimestre: ");
        double n4Double = scanner.nextDouble();
        System.out.printf("\nMédia dos bimestres: %.2f\n", (nDouble + n2Double + n3Double + n4Double) / 4);
        
        scanner.close();
    }
}
