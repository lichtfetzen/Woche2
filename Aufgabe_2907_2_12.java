/*
        Aufgabe 11 / JAV1 / 2.Woche
        2D Array gefüllt mit Zufallszahlen, anschließend zeilenweise Ausgabe
 */

package Woche2;

// Zusaetzliche Klasse importieren
import java.util.Scanner;                   // für Eingabe

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2907_2_12 {

    public static void main(String[] args) {
        
        // Neue Objekte erzeugen
        Scanner sc = new Scanner(System.in);        // für Eingabe
        
        // Variablendeklaration
        int anzZeilen;                              // Eingabe Zeilen wird gespeichert
        int anzSpalten;                             // Eingabe Spalten wird gespeichert
        
        
        // Eingabeaufforderung
        System.out.println("Bitte Zeilenanzahl angeben: ");     // Ausgabe
        anzZeilen = sc.nextInt();                               // Input - Eingabe wird in Variable gespeichert
        System.out.println("Bitte Spaltenanzahl angeben: ");     // Ausgabe
        anzSpalten = sc.nextInt();                               // Input - Eingabe wird in Variable gespeichert
        
        
        
        // Neues Array erzeugen
        int [][] meinArray = new int[anzZeilen][anzSpalten];           // Typ int, 10 Zeilen, 10 Spalten
        
        // Array mit Zufallszahlen füllen
        for ( int i = 0 ; i < meinArray.length ; i++ )
        {
            for ( int j = 0 ; j < meinArray[i].length ; j++)
            {
                meinArray[i][j] = (int)(Math.random() * 130 + 20);      // z.B. 0.1 * 130 + 20 = 33.0 -> (int)33
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