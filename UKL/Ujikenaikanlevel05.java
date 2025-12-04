/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel05;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ujikenaikanlevel05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int menangPemain = 0;
        int menangKomputer = 0;

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        System.out.println("=== Permainan Lempar Dadu ===");
        System.out.println("Tekan apa saja untuk melempar dadu...");

        while (menangPemain < 5 && menangKomputer < 5) {

            System.out.print("\nTekan tombol apapun untuk melempar: ");
            sc.nextLine();

            int daduKomputer = rand.nextInt(6) + 1;
            int daduPemain = rand.nextInt(6) + 1;

            // Simpan ke ArrayList
            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("Dadu Komputer : " + daduKomputer);
            System.out.println("Dadu Pemain   : " + daduPemain);

            // Menentukan pemenang ronde
            if (daduPemain > daduKomputer) {
                menangPemain++;
                System.out.println("Pemain menang di ronde ini!");
            } else if (daduKomputer > daduPemain) {
                menangKomputer++;
                System.out.println("Komputer menang di ronde ini!");
            } else {
                System.out.println("Seri!");
            }

            System.out.println("Skor sementara → Pemain: " + menangPemain + " | Komputer: " + menangKomputer);
        }

        System.out.println("\n=== Permainan Selesai ===");
        if (menangPemain == 5) {
            System.out.println("Pemain mencapai 5 kemenangan! Pemain menang!");
        } else {
            System.out.println("Komputer mencapai 5 kemenangan! Komputer menang!");
        }

        // Ringkasan
        System.out.println("\n=== Rekap Semua Lemparan ===");
        System.out.println("a. Riwayat lemparan komputer : " + riwayatKomputer);
        System.out.println("b. Riwayat lemparan pemain   : " + riwayatPemain);
    }
}
    

