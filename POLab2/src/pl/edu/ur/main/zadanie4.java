/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author Bart
 */
public class zadanie4 {

    public static void main(String[] args) {
        int a; // zmienna globalna
        boolean b = true;

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj liczby do tablicy: ");
            tablica[i] = scanner.nextInt();

        }

        System.out.println("Wybierz opcje: \n");

        System.out.println("oblicz sumę elementów tablicy: 1\n\t");
        System.out.println("oblicz iloczyn elementów tablicy: 2\n\t");
        System.out.println("wyznacz wartość średnią: 3\n\t");
        System.out.println("wyznacz wartość minimalną: 4\n\t");
        System.out.println("wyznacz wartość maksymalną: 5\n\t");

        do {
            Scanner odczyt = new Scanner(System.in);
            a = odczyt.nextInt();
            if (a == 1) {

                b = true;
                int sum = 0;
                for (int i = 0; i < tablica.length; i++) {

                    sum = IntStream.of(tablica).sum();
                }
                System.out.println("Suma: " + sum);
            } else if (a == 2) {
                b = true;
                int sum = 1;
                for (int i : tablica) {
                    sum *= i;
                }
                System.out.println("Iloczyn: " + sum);
            } else if (a == 3) {
                b = true;
                int sum = 0;
                for (int i = 0; i < tablica.length; i++) {

                    sum = (IntStream.of(tablica).sum()) / tablica.length;
                }
                System.out.println("wartosc srednia: " + sum);

            } else if (a == 4) {
                b = true;
                int sum = tablica[0];
                for (int i = 1; i < tablica.length; i++) {
                    if (tablica[i] < sum) {
                        sum = tablica[i];
                    }
                }
                System.out.println("Min: " + sum);
            } else if (a == 5) {
                b = true;
                int sum = tablica[0];
                for (int i = 1; i < tablica.length; i++) {
                    if (tablica[i] > sum) {
                        sum = tablica[i];
                    }
                }
                System.out.println("Max: " + sum);
            } else {
                b = true;
            }

        } while (b == true);

    }
}
