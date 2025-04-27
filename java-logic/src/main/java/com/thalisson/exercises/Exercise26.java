package com.thalisson.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) { 
            System.out.printf("\nDigite o %d° número: ", i + 1);
            numbers.add(scanner.nextDouble());
        }
        
        for (int i = 0; i < 3; i++){
            for(int j = i + 1; j < 3; j++){
                if(numbers.get(i) < numbers.get(j)){ 
                    double actualNumber = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, actualNumber);
                }
            }
        }

        System.out.print("\nNúmeros em ordem decrescente\n");
        for (int i = 0; i < 3; i++){
            System.out.printf("\n%.0f\n", numbers.get(i));
        }
        scanner.close();
    }
}