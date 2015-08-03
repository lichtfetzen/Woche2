/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Woche2;

// Klassen importieren
import java.util.Scanner;   // für Eingaben
import java.util.Random;    // für Zufallsgeneratoren
import java.util.Arrays;    // zur Arraymanipulation


/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2907_1_4_Klasse_Arrays {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        Random zufall = new Random();
        
        int [] meinArray = new int[20];
        
        for ( int i = 0 ; i < meinArray.length ; i++)
        {
            meinArray[i] = zufall.nextInt(50);
        }
        
        Arrays.sort(meinArray);         // Aufruf Methode 'sort' der Klasse 'Arrays' auf 'meinArray'
        
        System.out.println("Array sortiert!");
        
        for ( int x : meinArray )
        {
            System.out.print( x + " ");
        }
        
    }

}

