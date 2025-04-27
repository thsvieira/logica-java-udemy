package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a letra de uma das opções: \n");
        System.out.print("1. F\n2. M\n\n");
        char nChar = scanner.nextLine().charAt(0);
        String option = "";
        switch (nChar) {
            case 'F':
            option = "F - Feminino\n";
            break;
            case 'M':
            option = "M - Masculino\n";
            break;
            default:
            option = "Opção inválida\n";
        }

        System.out.printf("%s", option);

        scanner.close();
    }
}