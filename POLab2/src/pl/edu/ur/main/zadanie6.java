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
public class zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        while (true) {
            System.out.println("Podaj liczbe: ");
            a = scanner.nextInt();
            if (a < 0) {
                break;
            }

        }
    }

}
