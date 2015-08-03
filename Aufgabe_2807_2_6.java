/*
        NICHT FERTIG!!!

        Aufgabe 6 / JAV1 / 2. Woche

        Array
        - Typ int
        - 60 Elemente
        - mit Random 0 bis 1 gefüllt
        - danach aufsteigend sortiert ( Bubble Sort )
 */


package Woche2;

import java.util.Random;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2807_2_6 {

    public static void main(String[] args) {

        // Neues Randomobjekt erzeugen
        Random zufall = new Random();
        
        // Array deklarieren
        int [] arr = new int[60];
        
        // Variablen deklarieren
        int k = arr.length;
        int schalter = 1;
        int i;
        
        // Zeilenumbruch
        System.out.println("Das Array im unsortierten Zustand:");
        
        // Array mit Zufallszahlen füllen und ausgeben
        for (int j = 0; j < arr.length ; j++)
        {
            arr[j] = zufall.nextInt(2);
            System.out.print(arr[j] + " ");
        }
        
        // Sortieren
        while( k > 0 && schalter == 1)
        {
            i = 1;
            schalter = 0;
            while(i<k)
            {
                if( arr[i] < arr[(i-1)] )
                {
                    arr[i] = arr[i] + arr[i-1];
                    arr[i-1] = arr[i] - arr[i-1];
                    arr[i] = arr[i] - arr[i-1];
                    schalter = 1;
                }
                i++;
            }
            k--;
        }
        
        // Zeilenumbruch
        System.out.println(" ");
        
        // Zeilenumbruch
        System.out.println(" ... und danach:");
        
        // Ausgabe
        for (int j=0; j<arr.length ; j++)
        {
            System.out.print(arr[j] + " ");
        }
        

        
    }

}