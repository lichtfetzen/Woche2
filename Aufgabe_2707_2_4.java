/*
        Aufgabe 4 / JAV1 / 2. Woche

        Spiegeln eines Arrays
 */

package Woche2;

// Klasse Random erlaubt das instanziieren eines Zufallszahlengenerators
import java.util.Random;



/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_2_4 {

    public static void main(String[] args) {
        
        // Array deklararieren - Typ int - Laenge 20
        int [] myArray = new int[20];
        
        // Zufallsgenerator erzeugen
        Random zufall = new Random();
        
        
       // myArray wird mit Zufallszahlen zwischen 30 und 78 gefüllt und ausgegeben
        for ( int i = 0 ; i < myArray.length ; i ++)
        {
            myArray[i] = zufall.nextInt(48) + 30;
            System.out.print(myArray[i] + " ");
        }       
        
        // Gespeicherte Werte im myArray werden gespiegelt
        for ( int i = 0, j = (myArray.length - 1); i <= (myArray.length/2) ; i++, j-- )
        {
            myArray[i] = myArray[i] + myArray[j];
            myArray[j] = myArray[i] - myArray[j];
            myArray[i] = myArray[i] - myArray[j];  
        }        
       
        // Leerzeile
        System.out.println("" );
        
        // Gespiegelte Werte werden ausgegeben
        for ( int i = 0 ; i < myArray.length ; i ++)
        {
            System.out.print(myArray[i] + " ");
        }                   
    }
}

