/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel;

/**
 *
 * @author LOQ
 */ 
import java.util.Scanner;

public class Ujikenaikanlevel01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah bilangan (50 - 100): ");
        int angka = input.nextInt();
        
        if (angka < 50 || angka > 100) {
            System.out.println("Input harus antara 50 sampai 100!");
            return; 
        }

        boolean prima = true;

                for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                prima = false;
                break;
            }
        }

        if (prima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " adalah bukan bilangan prima");
  }

}
}

                      
             
 
  
 

  

