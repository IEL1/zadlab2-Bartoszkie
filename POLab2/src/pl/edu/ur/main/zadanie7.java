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
public class zadanie7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rozmiar, a;
        System.out.println("podaj rozmiar tablicy: ");
        rozmiar = scanner.nextInt();

        int[] tablica = new int[rozmiar];
        for (int i = 0; i < tablica.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            tablica[i] = scanner1.nextInt();
            
        }
        
        System.out.println("Sortowanie metada bobelkowa: 1\n");
        System.out.println("Sortowanie metada wstawiania: 2\n");
        
        a = scanner.nextInt();
        if (a == 1){
            int pomoc;
            int zmiana = 1;
            
            while ( zmiana > 0){
                zmiana = 0;
                for (int i = 0; i < tablica.length-1; i++){
                    if(tablica[i] > tablica[i+1]){
                        
                        pomoc = tablica[i+1];
                        tablica[i+1] = tablica[i];
                        tablica[i] = pomoc;
                        zmiana ++;
                    }
                }
            }
            for(int i =0; i <tablica.length; i++){
                System.out.println(tablica[i]+"");
            }
        }

    }

}
