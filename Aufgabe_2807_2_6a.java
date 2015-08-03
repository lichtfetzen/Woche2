/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Woche2;


// Klasse Random zur instanziierung importieren
import java.util.Random;


/**
 *
 * @author w4s1m0t0
 */


public class Aufgabe_2807_2_6a {

    public static void main(String[] args) {

        
        // Random Objekt erzeugen
        Random zufall = new Random();
        
        
        // Array deklarieren und reservieren
        int [] meinArray = new int[60];        
        
       
        // Variablendeklaration und init
       
        int nullen = 0;     // Hier wird die Anzahl der Nullen im Array gespeichert      
        
        
        // Array mit Zufallswerten füllen und die 0 zählen
        for ( int i = 0 ; i < meinArray.length ; i++ )
        {
            meinArray[i] = zufall.nextInt(2);
            if ( meinArray[i] == 0)                 // Wenn eingetrage Zufallszahl 0 entspricht
            {
                nullen++;                           // Dann die Variable nullen um eins erhöhen
            }
        }
        
        
        // Ausgabe vor dem Sortieren
        for ( int x : meinArray )
        {
            System.out.print(x + " ");
        }
        
        
        // Sortieren
        for ( int i = 0 ; i < meinArray.length ; i++)
        {
            meinArray[i] = ( i < nullen ) ? 0 : 1;
        }
        
        
        // Zeilenumbruch
        System.out.print("\n");
        
        
        // Ausgabe nach dem Sortieren
        for ( int x : meinArray )
        {
            System.out.print(x + " ");
        }      
        
        // Zeilenumbruch
        System.out.print("\n");
        
        // Anzahl der Nullen ausgeben
        System.out.println("Anzahl vorhanderer Nullen: " + nullen);
        
        
        
    }

}

