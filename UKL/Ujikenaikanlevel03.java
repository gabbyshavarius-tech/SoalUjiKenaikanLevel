/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel03;

/**
 *
 * @author LOQ
 */
  import java.util.Random;
import java.util.Scanner;
public class Ujikenaikanlevel03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String lanjut = "y";

        while (lanjut.equalsIgnoreCase("y")) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;

            char[] operator = {'*', '/', '%'};
            char op = operator[rand.nextInt(operator.length)];

            System.out.print(a + " " + op + " " + b + " = ");
            int jawaban = sc.nextInt();

            int hasil = 0;

            switch (op) {
                case '*': hasil = a * b; break;
                case '/': hasil = a / b; break;
                case '%': hasil = a % b; break;
            }

            System.out.println("Hasil yang benar: " + hasil);

            System.out.print("Lanjut kuis? (y/n): ");
            lanjut = sc.next();
        }

        System.out.println("Program berhenti. Terima kasih!");
    }
}
    

