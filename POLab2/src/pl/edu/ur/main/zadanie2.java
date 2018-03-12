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
@SuppressWarnings("empty-statement")
public class zadanie2 {

    public static void main(String[] args) {

        boolean x = false;

        System.out.println("jaką operację chcesz wykonać?");
        System.out.println("dodawanie: nacisnij 1?");
        System.out.println("odjemowanie: nacisnij 2");
        System.out.println("dzielenie: nacisnij 3");
        System.out.println("mnożenie: nacisnij 4");

        do {
            int wynik;
            Scanner odczyt = new Scanner(System.in);
            int zadania = odczyt.nextInt();

            switch (zadania) {
                case 1:

                    System.out.println("dodawanie: podaj dwie liczby: ");
                    int a = odczyt.nextInt();
                    int b = odczyt.nextInt();

                    int wynik1; 
                    wynik1 = a+b;
                    System.out.println("Wynik: " + wynik1);
                    break;

                case 2:

                    System.out.println("odejmowanie: podaj dwie liczby: ");
                    int c = odczyt.nextInt();
                    int d = odczyt.nextInt();

                    int wynik2; 
                    wynik2 = c-d;
                    System.out.println("Wynik: " + wynik2);
                    break;
                    
                case 3: 
                    
                    System.out.println("mnozenie: podaj dwie liczby: ");
                    int e = odczyt.nextInt();
                    int f = odczyt.nextInt();
                    int wynik3; 
                    wynik3 = e*f;
                    System.out.println("Wynik: " + wynik3);
                    break;
                    
                case 4:
                    
                    System.out.println("dzielenie: podaj dwie liczby: ");
                    int g = odczyt.nextInt();
                    int h = odczyt.nextInt();
                    int wynik4; 
                    wynik4 = g/h;
                    System.out.println("Wynik: " + wynik4);
                    break;

                default:
                    x = true;
            }

        } while (x == true);

    }
}
