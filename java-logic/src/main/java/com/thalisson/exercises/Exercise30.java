package com.thalisson.exercises;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int nInt = 0;
        int n2Int = 0;
        int n3int = 0;
        String month = "";

        do {
            System.out.print("Informe qual é o número do dia atual: ");
            nInt = scanner.nextInt();
        } while(nInt < 0 || nInt > 31);

        do {
            System.out.print("\nInforme qual o número do mês atual: ");
            n2Int = scanner.nextInt();
            switch (n2Int) {
                case 1:
                    month = "Janeiro";
                    break;
                case 2:
                    month = "Fevereiro";
                    break;
                case 3:
                    month = "Março";
                    break;
                case 4:
                    month = "Abril";
                    break;
                case 5:
                    month = "Maio";
                    break;
                case 6:
                    month = "Junho";
                    break;
                case 7:
                    month = "Julho";
                    break;
                case 8:
                    month = "Agosto";
                    break;
                case 9:
                    month = "Setembro";
                    break;
                case 10:
                    month = "Outubro";
                    break;
                case 11:
                    month = "Novembro";
                    break;
                case 12:
                    month = "Dezembro";
                default:
                    month = "Mês inválido";
                    break;
            }
        } while (n2Int < 1 || n2Int > 12);

        System.out.print("\nInforme o ano atual: ");
        n3int = scanner.nextInt();

        if (n2Int == 1 || n2Int == 2) {
            n2Int += 12;
            n3int -= 1;
        }

        int year = n3int % 100;
        int century = n3int / 100;

        int dayNumber = (nInt + (13 * (n2Int + 1)) / 5 + year + (year / 4) + (century / 4) + (5 * century)) % 7;
        String dayOfTheWeek = "";

        switch (dayNumber) {
            case 0:
                dayOfTheWeek = "sábado";
                break;
            case 1:
                dayOfTheWeek = "domingo";
                break;
            case 2:
                dayOfTheWeek = "segunda-feira";
                break;
            case 3:
                dayOfTheWeek = "terça-feira";
                break;
            case 4:
                dayOfTheWeek = "quarta-feira";
                break;
            case 5:
                dayOfTheWeek = "quinta-feira";
                break;
            case 6:
                dayOfTheWeek = "sexta-feira";
                break;
        }
        
        System.out.printf("\nHoje é %s do dia %d de %s de %d.\n", dayOfTheWeek, nInt, month, n3int);
        scanner.close();
    }
}