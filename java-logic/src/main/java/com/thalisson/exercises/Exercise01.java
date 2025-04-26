package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Digite um texto a ser impresso na tela.");
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();
        System.out.printf("Texto digitado: %s\n", text);
        read.close();
    }
}