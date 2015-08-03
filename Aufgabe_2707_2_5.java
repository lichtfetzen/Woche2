/*
        NICHT FERTIG!!!

        Aufgabe 5 / JAV1 / 2. Woche

        Array
        - Typ int
        - 20 Elemente
        - mit Random 10 bis 90 gefüllt
        - danach absteigend sortiert ( Bubble Sort )
 */


package Woche2;

import java.util.Random;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_2_5 {

    public static void main(String[] args) {

        // Neues Randomobjekt erzeugen
        Random zufall = new Random();
        
        // Array deklarieren
        int [] arr = new int[20];
        
        // Variablen deklarieren
        int k = arr.length;
        int schalter = 1;
        int i;
        
        // Zeilenumbruch
        System.out.println("Das Array im unsortierten Zustand:");
        
        // Array mit Zufallszahlen füllen und ausgeben
        for (int j = 0; j < arr.length ; j++)
        {
            arr[j] = zufall.nextInt(80) + 10;
            System.out.print(arr[j] + " ");
        }
        
        // Sortieren
        while( k > 0 && schalter == 1)
        {
            i = 1;
            schalter = 0;
            while(i<k)
            {
                if( arr[i] > arr[(i-1)] )
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