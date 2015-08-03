/*
    Kreiszahl PI kann nach folgender Formel
 */

package Woche2;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_1_14 {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        double pi = 4.;
        double nenner;          // Nennen
        double vz;              // Vorzeichen
        long rg;                // Reihenglieder
        
        for ( rg = 1 , nenner = 3. , vz = -1. ; rg <= 10000000 ; rg++ , nenner += 2 , vz = -vz )
        {
            pi += 4.*vz/nenner;
        }
        System.out.format("\n%14.12f", pi);
        
    }

}

