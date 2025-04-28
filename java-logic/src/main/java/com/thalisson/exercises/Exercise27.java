package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual período você estuda?\n");
        System.out.print("\nEscolha a letra de uma das opções:\n");
        System.out.print("M - Matutino\nV - Vespertino\nN - Noturno\n\n");
        char nChar = scanner.nextLine().charAt(0);
        String greeting = "";
        switch (nChar) {
            case 'M':
                greeting = "Bom dia!";
                break;
            case 'V':
                greeting = "Boa tarde!";
                break;
            case 'N':
                greeting = "Boa noite!";
                break;
            default:
                greeting = "Valor inválido!";
                break;
        }
        System.out.printf("%s\n", greeting);
        scanner.close();
    }
}