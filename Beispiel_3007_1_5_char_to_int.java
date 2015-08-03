/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Woche2;


/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_3007_1_5_char_to_int {

    public static void main(String[] args) {

        char c = '\u0041';  // Zeichen A - HEX Wert 41 entspricht Dezimalwert 4 * 16 + 1 = 64 + 1 = 65
        
        int x = c;
        
        String text = "Das ist ein Test";
        
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.format("x(hex) = %x\n", x);
    }

}

