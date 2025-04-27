package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kgLimit = 50;
        double overwheightFine = 4.00;
        System.out.print("Informe a quantidade em KG do total de peixes: \n");
        double nDouble = scanner.nextDouble();
        if (nDouble > kgLimit) {
            double overwheight = nDouble - kgLimit;
            double totalOverwheightFine = overwheight * overwheightFine;
            System.out.printf("\nExcesso de peso: %.2f KG", overwheight);
            System.out.printf("\nMulta proporcional ao excesso: R$%.2f", totalOverwheightFine);
        }
        
        scanner.close();
    }
}