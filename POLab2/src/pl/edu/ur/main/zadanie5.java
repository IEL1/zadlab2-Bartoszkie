/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

/**
 *
 * @author Bart
 */
public class zadanie5 {

    public static void main(String[] args) {
        int a = 20;
        for (int i = 0; i < 20; i++) {

            if (a == 9 || a == 2 || a == 6 || a == 15 || a == 19) {
                continue;
            }
                System.out.println("liczby: " + a);
                a--;

            }
        }
    }


