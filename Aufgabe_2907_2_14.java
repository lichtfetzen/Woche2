/*
            Aufgabe 14 / JAV1 / 2. Woche

            - 10 Temperaturwerte pro Tag eines Monats
            - ein Monat hat 30 Tage
            - Temperaturwert zufällig zwischen -10,0°C und 20,0°C
            - geeignetes Array
            - 

 */

package Woche2;


/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2907_2_14 {

    public static void main(String[] args) {
        
        
        // Variable deklarieren
        int tag = 1;                    // Zaehler für Ausgabe des Tageszahl
        double minTemp;                 // niedrigster Temperaturwert eines Tages
        double maxTemp;                 // hoechster Temperaturwert eines Tages
        double tagesSchnitt;            // zur Aufsummierung aller Werte eines Tages
        double monatsSchnitt;           // zur Aufsummierung aller Tagesdurchschnittwerte eines Monats
        
        
        // Array deklarieren
        double [][] meinArray = new double [30][10];                // 2D-Array, Typ double, 30 Zeilen, 10 Spalten
        
        
        // Array mit Zufallszahlen (Temperaturwerten) befüllen
        for ( int i = 0 ; i < meinArray.length ; i++)               // Zeilenschleife
        {
            for ( int j = 0 ; j < meinArray[i].length ; j++)        // Spaltenschleife
            {
                meinArray[i][j] = Math.random() * 30 - 10;          // Methode 'random' der Klasse 'Math'
            }                                                       // gibt Wert zwischen -10.0 und 20.0 zurueck
        }
        

        // Ausgabe aller Tage mit allen Temperaturwerten
        for ( double [] x : meinArray )                             // Zeilenschleife
        {
            System.out.print("\nTag. "+ tag++ + "\t:");             // Ausgabe der Tageszahl
            for ( double y : x )                                    // Spaltenschleife
            {
                System.out.format("%8.2f", y);                      // Ausgabe des jeweiligen Feldes
            }
        }
        
        
        // Aufgabe 14c
        // Minimum, Maximum und Durchschnittstemperatur pro Tag ausgeben
        
        // Werte zurücksetzen
        tag = 1;
        minTemp = 20.0;                 
        maxTemp = -10.0;
        tagesSchnitt = 0;
        monatsSchnitt = 0;
        
        
        System.out.println();           // Leerzeile
        
        
        // Ermitteln des Tagesmaximums, -minimums und des Durchschnitts
        for ( int i = 0 ; i < meinArray.length ; i++)                                       // Zeilenschleife
        {
            System.out.print("\nTag " + tag++ + "\t:");                                     // Ausgabe: lfd. Tageszahl
            for ( int j = 0 ; j < meinArray[i].length ; j++)                                // Spaltenschleife
            {
                minTemp = ( meinArray[i][j] <= minTemp ) ? meinArray[i][j] : minTemp ;      // Minimum wird gesucht und wenn gefunden, gespeichert
                maxTemp = ( meinArray[i][j] >= maxTemp ) ? meinArray[i][j] : maxTemp ;      // Maximum wird gesucht und wenn gefudnen, gespeichert
                tagesSchnitt += meinArray[i][j];                                            // Temperaturwerte werden aufsummiert
            }
            // Ausgabe der ermittelten Werte
            System.out.format("\tMin.:%8.2f\t\tMax.:%8.2f\t\tDurchschnitt:%8.2f", minTemp, maxTemp, tagesSchnitt / meinArray[i].length);
            
            monatsSchnitt += tagesSchnitt / meinArray[i].length;    // Durchschnittswerte pro Tag werden aufsummiert
            minTemp = 20.0;                                         // Minimum wird zurueckgesetzt
            maxTemp = -10.0;                                        // Maximum wird zurueckgesetzt
            tagesSchnitt = 0.0;                                     // Tagesduchschnitt wird zurueckgesetzt
        }
        
        
        // Aufgabe 14d
        // Monatsdurchschnitt ergibt sich aus aufsummierten Tagesduchschnittswerten geteilt duch Anzahl der Tage
        
        // Ausgabe des Montasdurchschnitts
        System.out.format("\n\nDurchschnittliche Temperatur für den Monat:%8.2f\n", monatsSchnitt / meinArray.length);
        

    }

}

