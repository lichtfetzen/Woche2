/*
        Aufgabe 10 / JAV1 / 2. Woche

        Rotation in einem Array
        - Anzahl der Rotationen kann eingegeben werden
 */

package Woche2;

// Benoetigte Klassen importieren
import java.util.Scanner;   // für Tastatureingabe
import java.util.Random;    // für Zufallszahlengenerator


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2907_2_10 {

    public static void main(String[] args) {

        // Neue Objekte erzeugen
        Scanner sc = new Scanner(System.in);    // Eingabe 'sc'
        Random zufall = new Random();           // Zufallszahlgenerator 'zufall'
        
        // Array deklarieren
        int [] a = new int[10];                 // Array 'a' vom Typ 'int', Laenge 10 Elemente
        
        // Variablendeklaration
        int rotAnzahl = 0;                      // Speichert die Eingabe: Anzahl der gewünschten Rotationen
        int merkZahl;                           // Zwischenspeicher für Tausch des neues ersten Elementes
        
        // Array mit Zufallszahlen befüllen
        for ( int i = 0 ; i < a.length ; i++ )
        {
            a[i] = zufall.nextInt(10);         // Jedes Element wird mit einer Zahl zwischen 0 und 9 befüllt
        }
        
        // Zwischenausgabe
        for ( int x : a )                       // Jedes Element des Array wird ausgegeben
        {
            System.out.print(x + " ");
        }
        System.out.print("\n");                 // Neue Zeile
        
        
        // Eingabeaufforderung
        System.out.print("Wieviele Rotationen? ");
        
        // Eingabe in Variable 'rotAnzahl' speichern
        rotAnzahl = sc.nextInt();
        
        
        // Rotation
        for ( int j = 0 ; j < rotAnzahl ; j++)
        {
            merkZahl = a[a.length - 1];                 // Letzes Element des Array wird zwischengespeichert
            for ( int i = a.length - 1 ; i > 0 ; i--)   // Schleifenzaehler gleich Index des letzen Elementes, absteigend
            {
                a[i] = a[i-1];                          // In Element 'i' wird das vorherige 'i-1' gespeichert
            }
            a[0] = merkZahl;                            // In das erste Element wird das gespeicherte letzte Element gespeichert
            for ( int x : a )
            {
                System.out.print(x + " ");              // Ausgabe des gesamten Arrays nach Rotation
            }
            System.out.print("\n");                     // Neue Zeile
        }
        
    }

}

