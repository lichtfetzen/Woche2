/*

        Aufgabe 8 / 2. Woche / JAV1

 */

package Woche2;

// Klassenimport
import java.util.Scanner;           // Scanner für Tastatureingaben
import java.util.Random;            // Random für Zufallszahlengenerator
//

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2807_2_8 {

    public static void main(String[] args) {

        // Neue Ojekte erzeugen
        Scanner sc = new Scanner(System.in);        // Scannerobjekt für Eingaben mit dem Namen 'sc' erzeugen
        Random zufall = new Random();               // Zufallsgenerator mit dem Namen 'zufall' erzeugen
        
        // Variablendeklaration
        int counter = 0;                            // Zaehler für Treffer, mit '0' initialisiert
        int zahl;                                   // In 'zahl' wird die Eingabe gespeichert
        
        // Arraydeklaration
        int [] meinArray = new int[500];             // 'meinArray' vom Typ INT und einer Elementanzahl von 50
        
        
        // Array befüllen
        for ( int i = 0 ; i < meinArray.length ; i++)       // Wiederhole, so lange 'i' kleiner der Arraylaenge ist
        {
            meinArray[i] = zufall.nextInt(100) + 20;        // Aktuelles Arrayfeld wird mit einer Zufallszahl
                                                            // zwischen 20 und 120 befüllt
        }
        
        
        // Eingabeaufforderung
        System.out.print("Bitte geben Sie eine Zahl ein: ");    
        
        // Eingabe speichern
        zahl = sc.nextInt();                                    // Eingegebener Wert wird in Variable 'zahl' als Int gespeichert
        
        
        // Pruefen, ob eingegebener Wert im Array vorhanden
        for ( int i = 0 ; i < meinArray.length ; i ++)
        {
            if (meinArray[i] == zahl)                                                   // Wenn eingegebene Zahl gleich Wert an aktueller Arrayposition
            {
                counter++;                                                              // Erhöhe Zaehler um 1
                System.out.print("\n" + counter + ". Treffer an Position: " + (i+1));   // Gebe Position im Array an
            }
        }
        
        
        // Endausgabe
        if ( counter != 0)                                                                              // Wenn Zaehler ungleich 0
        {
            System.out.println("\n\nDer Wert " + zahl + " kommt insgesamt " + counter + " Mal vor.");   // Ausgeben wie haefig die Zahl vorkam
        }
        else                                                                                            // Sonst
        {
            System.out.println("Der eingegebene Wert " + zahl + " wurde nicht gefunden.");              // Kein Treffer ausgeben
        }
        
        
    }

}

