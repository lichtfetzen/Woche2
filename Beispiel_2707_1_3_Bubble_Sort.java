/*
            BUBBLE SORT
 */

package Woche2;

import java.util.Random;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2707_1_3_Bubble_Sort {

    public static void main(String[] args) {


        Random zufall = new Random();
        
        int [] arr = {1,99,22,54};
        
        int k = arr.length;
        int schalter = 1;
        int i;
        
        while( k > 0 && schalter == 1)
        {
            i = 1;
            schalter = 0;
            while(i<k)
            {
                if( arr[i] < arr[(i-1)] )
                {
                    arr[i] = arr[i] + arr[i-1];
                    arr[i-1] = arr[i] - arr[i-1];
                    arr[i] = arr[i] - arr[i-1];
                    schalter = 1;
                }
                i++;
            }
            k--;
        }
        
        for (int j=0; j<arr.length ; j++)
        {
            System.out.print(arr[j] + " ");
        }
        

        
    }

}

