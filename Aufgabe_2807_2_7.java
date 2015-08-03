/*

        Ziehung Lottozahlen

        Wie häufig wurden die Zahlen 1 - 49 über 52. Wochen gezogen?

 */

package Woche2;

// Klasse Random für Zufallsgenerator importierren
import java.util.Random;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2807_2_7 {

    public static void main(String[] args) {

        // Generator erzeugen
        Random zufall = new Random();
        
        // Array zum erfassen aller möglichen Lottozahlen erzeugen ( 1 - 49 ) also Laenge 49
        int [] array = new int[49];
        
        // Variable deklarieren
        int zahl;                   // Zwischenspeicher
        int jahre = 10;             // Anzahl der Jahre
        
        for ( int i = 0 ; i < jahre*52 ; i++)
        {
            System.out.print((i+1) + ". Ziehung:\t");
            for ( int j = 0 ; j < 6 ; j++)
            {
                zahl = zufall.nextInt(49)+1;
                array[zahl-1] += 1;
                System.out.print("Zahl " + (j+1) + ": " + zahl + "\t");
            }
            System.out.print("\n");
        }
        
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.println("Die Zahl " + (i+1) + " wurde " + array[i] + " mal gezogen.");
        }
        
    }

}

