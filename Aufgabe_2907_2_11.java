/*
        Aufgabe 11 / JAV1 / 2.Woche
        2D Array gefüllt mit Zufallszahlen, anschließend zeilenweise Ausgabe
 */

package Woche2;


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2907_2_11 {

    public static void main(String[] args) {

        // Neues Array erzeugen
        int [][] meinArray = new int[10][10];           // Typ int, 10 Zeilen, 10 Spalten
        
        // Array mit Zufallszahlen füllen
        for ( int i = 0 ; i < meinArray.length ; i++ )
        {
            for ( int j = 0 ; j < meinArray[i].length ; j++)
            {
                meinArray[i][j] = (int)(Math.random() * 130 + 20);
            }
        }
        
        // Zeilenweise Ausgabe des Arrays
        for ( int [] x : meinArray )
        {
            System.out.println();
            for ( int y : x )
            {
                System.out.print(y + "\t");
            }
        }
        
    }

}

