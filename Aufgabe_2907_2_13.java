/*
        Aufgabe 13 / JAV1 / 2.Woche
 */

package Woche2;


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2907_2_13 {

    public static void main(String[] args) {

        // Array deklarieren
        int [][] meinArray = new int[10][10];
        
        // Array mit Zufallszahlen diagonal befüllen
        for ( int i = 0 ; i < meinArray.length - 1 ; i++)
        {
            for ( int j = i + 1 ; j < meinArray[i].length ; j++)
            {
                meinArray[i][j] = (int)(Math.random() * 10 + 10);       // mit Zufallswerten zwischen 10 und 19 befüllen
                meinArray[j][i] = meinArray[i][j];                      // Werte an der Diagonalen spiegeln
            }
        }
        
        // Kontrollausgabe
        for ( int [] x : meinArray )
        {
            for ( int y : x )
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
    }

}

