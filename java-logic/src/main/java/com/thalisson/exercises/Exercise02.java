package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro.");
        if (!scanner.hasNextInt()) {
            String noInt = scanner.nextLine();
            System.out.printf("%s: não é um número inteiro.\n\n", noInt);
        } else {
            int nInt = scanner.nextInt();
            scanner.nextLine(); 
            System.out.printf("%d: é um número inteiro.\n\n", nInt);
        }

        System.out.println("Digite um número com casas decimais (separado por .)");
        String number = scanner.nextLine();
        double nNumber = Double.parseDouble(number);
        
        if (nNumber % 1 == 0) {
            System.out.printf("%s: não é um número com casas decimais.\n\n", number);
        } else {
            System.out.printf("%.2f: é um número com casas decimais.\n\n", nNumber);
        }
        

        System.out.println("Digite um texto qualquer com mais de um character.");
        String nString = scanner.nextLine();
        if (nString.length() <= 1) {
            System.out.printf("%s: não é um texto com mais de um character.\n\n", nString);
        } else {
            System.out.printf("%s: é um texto com mais de um character.\n\n", nString);
        }

        System.out.println("Digite um caracterer qualquer.");
        String nChar = scanner.nextLine();
        if (nChar.length() > 1) {
            System.out.printf("%s: não é um texto com um único caracter.\n\n", nChar);
        } else {
            System.out.printf("%c: é um caractere único.\n\n", nChar.charAt(0));
        }

        scanner.close();
    }
}
