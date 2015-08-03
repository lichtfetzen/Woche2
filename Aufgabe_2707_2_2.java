/*
        Aufgabe 2 / 2. Woche / JAV1
        
        Array int 50 Elemente
        gefüllt mit Zufallszahlen zwischen 0 und 250 (exkl.)
        Maximum ermitteln


 */

package Woche2;

// Die Klasse Random erlaubt das instanziieren eines Zufallszahlengenerators
import java.util.Random;


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_2_2 {

    public static void main(String[] args) {
        
        // Zufallsgenerator 'rd' erzeugen
        Random rd = new Random();
        
        // Array mit dem Namen 'arr' und der Laenge 50 als Typ int erzeugen
        int [] arr = new int[50];

        // Variablen deklarieren
        int max = 0;                        // Voreingestelltes Maximum
        
        for ( int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = rd.nextInt(250);
            if ( arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.format("Das Maximum lautet: %5d\n", max);
    }
}

