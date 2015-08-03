/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Woche2;

// Klassen importieren
import java.util.Scanner;       // zur Tasta-Eingabe
import java.util.Random;        // für Zufallszahlengenerator
import java.util.Arrays;        // zur Arraymanipulation

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2907_Binaere_Suche {

    public static void main(String[] args) {

        // Array deklarieren
        int [] meinArray = new int[20];
        
        // Objekte erzeugen
        Scanner sc = new Scanner(System.in);
        Random zufall = new Random();
        
        // Variablen deklarieren
        int uGrenze = 0;                            // Untere Suchgrenze
        int oGrenze = meinArray.length - 1;         // Obere Suchgrenze
        int mPunkt = 0;                             // Mittelpunkt
        int gesucht = 0;                            // Eingabe <- gesuchter Wert
        int durchlauf = 0;                          // Anzahl der Durchlaeufe
        boolean flag = false;                       // Zeiger, wenn Treffer, dann auf true
        
        
        // Array mit Zufallszahlen befüllen
        for ( int i = 0 ; i < meinArray.length ; i++ )
        {
            meinArray[i] = zufall.nextInt(100);      // Zufallszahlen, Typ int,, von 0 bis 99
        }
        
        // Array sortieren
        Arrays.sort(meinArray);                         // Methodenaufruf sort der Klasse Arrays auf 'meinArray'
        System.out.print("Array wurde sortiert!\n");    // Ausgabe Info
        
        
        // Zwischenausgabe
        for ( int x : meinArray )
        {
            System.out.print(x + " ");                  // gebe jedes Element des Arrays aus
        }
        System.out.print("\n");                         // Neue Zeile
        
        
        // Eingabeaufforderung
        System.out.print("Bitte gesuchten Wert eingeben: ");
        
        // Eingabe in Variable 'gesucht' speichern
        gesucht = sc.nextInt();                         // Eingabe wird in Variable 'gesucht' gespeichert
        
        
        // Binaere Suche nach gesuchtem Wert
        while ( uGrenze <= oGrenze )                    // Solange Untergrenze kleiner-gleich Obergrenze
        {
            mPunkt = ( uGrenze + oGrenze ) / 2;         // Mittelpunkt ermitteln: (Obergrenze + Untergrenze)/2
            if ( meinArray[mPunkt] == gesucht )         // Wenn der Wert an der Position des Mittelpunktes gleich dem gesuchten Wert...
            {
                flag = true;                            // Setze Schalter auf true
                uGrenze = oGrenze + 1;                  // Untergrenze > Obergrenze setzen, damit Abbruch
            }
            else                                        
            {
                if ( gesucht < meinArray[mPunkt] )      // Wenn gesuchter Wert kleiner dem Wert im Mittelpunkt
                {
                    oGrenze = mPunkt - 1;               // Setze neue Obergrenze um 1 unterhalb vom Mittelpunt
                }
                else                                    // Sonst
                {
                    uGrenze = mPunkt + 1;               // Setze neue Untergrenze um 1 oberhalb vom Mittelpunkt
                }
            }
            durchlauf++;                                // Erhöhe den Durchlaufzaehler um 1
        }
        
        // Ausgabe ob Wert gefunden oder nicht und Anzahl der Durchlaeufe
        if (flag)                                       // Wenn Schalter 'flag' auf true, dann ...
        {
            System.out.print("\nDie gesuchte Zahl " + gesucht + " wurde nach " + durchlauf + " Durchlaeufen gefunden!\n");  
        }
        else                                            // ... sonst ...
        {
            System.out.print("\nDie gesuchte Zahl " + gesucht + " wurde nach " + durchlauf + " Durchlaeufen NICHT gefunden!\n");
        }
       
    }

}

