/*
        Zufallszahlen

        Klasse: Random
            oder
        Methode: Math
 */

package Woche2;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

// Die Klasse Random erlaubt das Instaziieren eines Zufallsgenerators
import java.util.Random;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2707_1_2_Random {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Zufallsgenerator erzeugen
        Random rd1 = new Random();
        
        long zahl;
        
        zahl = rd1.nextLong();
        
        System.out.println(zahl);
        
        
        
        // Oder eben mit der Klassenmethode Math.random
        
        double zahl2;
        
        for (int i = 0; i < 1000; i++)
        {
            zahl2 = Math.random();
            System.out.format("\n%f", zahl2);
        }
        
        char  c = 'A';
        
        char b = '\u0042';
        
        int f = c;
        
        String d = "b";
        
        System.out.print("\n" + f + "\n");
    }

}

