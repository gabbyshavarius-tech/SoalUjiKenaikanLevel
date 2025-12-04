/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel02;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class Ujikenaikanlevel02 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] pecahan = {100000,50000,20000,10000,50000,2000,1000};
            System.out.println("Masukkan jumlah uang: ");
            int uang = input.nextInt();
            
          for (int p : pecahan ) {
              int lembar = uang / p;
              if (lembar > 0) {
                 System.out.println(lembar + "Lembar" + p);
                     uang = uang % p;
              }
    }
}
}