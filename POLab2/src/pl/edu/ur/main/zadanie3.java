/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Bart
 */
public class zadanie3 {

    public static void main(String[] args) {
        int a; // zmienna globalna
        boolean b = true;

        int tablica[] = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczby do tablicy: ");
            tablica[i] = scanner.nextInt();
        }

        System.out.println("Wybierz opcje: \n");

        System.out.println("Wyświetlanie tablicy od pierwszego do ostatniego indeksu: 1\n\t");
        System.out.println("Wyświetlanie tablicy od ostatniego do pierwszego indeksu: 2\n\t");
        System.out.println("Wyświetlanie elementów o nieparzystych indeksach: 3\n\t");
        System.out.println("Wyświetlanie elementów o parzystych indeksach: 4\n\t");

        do {

            Scanner odczyt1 = new Scanner(System.in);
            a = odczyt1.nextInt();
            if (a == 1) {
                b = false;
                for (int i = 0; i < 10; i++) {
                    System.out.println(tablica[i] + "");
                }
            } else if (a == 2) {
                b = false;
                for (int i = 9; i >= 0; i--) {
                    System.out.println(tablica[i] + "");
                }
            } else if (a == 3) {
                b = false;
                for (int i = 0; i < 10; i++) {
                    if (tablica[i] % 2 != 0) {
                        System.out.println(tablica[i] + "");
                    }

                }
            } else if (a == 4) {
                b = false;
                for (int i = 0; i < 10; i++) {
                    if (tablica[i] % 2 == 0) {
                        System.out.println(tablica[i] + "");
                    }
                }
            } else {
                b = true;
            }

        } while (b == true);

    }

}
