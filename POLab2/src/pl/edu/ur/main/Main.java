package pl.edu.ur.main;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author marcin
 */
public class Main {

    public static void main(String[] args){
        
       Scanner odczyt_globalny = new Scanner(System.in);
       int zadanie;
       zadanie = odczyt_globalny.nextInt();
              
       
       switch(zadanie){
           
           case 1:
               
                Scanner odczyt = new Scanner(System.in);
                int a = odczyt.nextInt();
                int b = odczyt.nextInt();
                int c = odczyt.nextInt();

                zadanie1 (a,b,c);
                System.out.println(zadanie1(a,b,c));
                    break;
           
         
           default:
               System.out.println("Błąd");
       }   

    }
    
    static double zadanie1 (int a, int b, int c){
        double delta; 
        delta = b*b - 4*(a*c);
        return delta;
    }

}
