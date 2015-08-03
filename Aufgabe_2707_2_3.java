/*
        Afugabe 3 / JAV1 / Woche 2
 */

package Woche2;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2707_2_3 {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        int jahr;                       // Eingabe Jahr
        int monat;                      // Eingabe Monat    
        int tag;                        // Eingabe Tag
        int gesamtTage = 0;             // Gesamttage
        
        // Arraydeklaration
        int [] arr = {31,28,31,30,31,30,31,31,30,31,30,31};     // Monatstage im NICHT-Schaltjahr
        
        System.out.print("Bitte geben Sie zunächst eine Jahreszahl ein: ");
        jahr = sc.nextInt();
        
        System.out.print("Nun geben Sie bitte den gewünschten Monat ein (1-12): ");
        monat = sc.nextInt()-1;
        
        System.out.print("Und zu guter Letzt den Tag des jeweiligen Monats ein: ");
        tag = sc.nextInt();
        
        
        
        if ( jahr % 400 == 0 || jahr % 4 == 0 && jahr % 100 != 0 ){
            arr[1] = 29;
        }
        
        
        for ( int i = 0 ; i < monat ; i ++)
        {
            gesamtTage += arr[i];
        }
        gesamtTage += tag;
        
        
        System.out.println("Der " + tag + "." + (monat+1) + "." + jahr + " ist der " + gesamtTage + ". Tag im Jahr");
        
        
        
    }

}

