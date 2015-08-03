/*
        2. Woche / JAV1 / Aufgabe 1

        Eindimensionales Array
            int
            50 Elemente

            Elementindex durch 2 teilbar? --> 0
            Elementindex nicht durch 2 teilbar? --> 1
 */

package Woche2;


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_2_1 {

    public static void main(String[] args) {
        
        // Array deklarieren
        
        int [] arr = new int[50];
        
        
        for ( int i = 0 ; i < arr.length ; i++ )
        {
            arr[i] = (i % 2 == 0) ? 0 : 1;                              // Pruefen ob Index durch 2 teilbar?
            System.out.format("Index: %-5d entspricht%2d\n",i,arr[i]);
        }
    }
}

