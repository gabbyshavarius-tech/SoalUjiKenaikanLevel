/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel7;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;


public class Ujikenaikanlevel7 {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis cookies: ");
        int n = input.nextInt();
        input.nextLine(); // Clear buffer

        // Array untuk menampung data
        String[] nama = new String[n];
        int[] hargaProduksi = new int[n];
        int[] hargaJual = new int[n];
        int[] jumlahTerjual = new int[n];

        int[] totalBiaya = new int[n];
        int[] totalPendapatan = new int[n];
        int[] labaRugi = new int[n];
        String[] status = new String[n];

        int totalLabaRugiKeseluruhan = 0;

        // Variabel untuk mencari laba tertinggi
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        System.out.println();

        // Input data cookies
        for (int i = 0; i < n; i++) {
            System.out.println("Cookies ke-" + (i + 1) + ":");

            System.out.print("Nama cookies: ");
            nama[i] = input.nextLine();

            System.out.print("Harga produksi per bungkus: ");
            hargaProduksi[i] = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            hargaJual[i] = input.nextInt();

            System.out.print("Jumlah terjual: ");
            jumlahTerjual[i] = input.nextInt();

            input.nextLine(); // clear buffer
            System.out.println();
        }

        // Perhitungan
        for (int i = 0; i < n; i++) {
            totalBiaya[i] = hargaProduksi[i] * jumlahTerjual[i];
            totalPendapatan[i] = hargaJual[i] * jumlahTerjual[i];
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];

            // Menentukan status laba/rugi
            if (labaRugi[i] > 0) {
                status[i] = "Laba";
            } else if (labaRugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }

            totalLabaRugiKeseluruhan += labaRugi[i];

            // Mencari laba terbesar
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                cookiesLabaTertinggi = nama[i];
            }
        }

        // Output
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s | %-12s | %-15s | %-12s | %-8s\n",
                "Nama Cookies", "Total Biaya", "Total Pendapatan", "Laba/Rugi", "Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s | Rp%-10d | Rp%-13d | Rp%-10d | %-8s\n",
                    nama[i], totalBiaya[i], totalPendapatan[i], labaRugi[i], status[i]);
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalLabaRugiKeseluruhan);
        System.out.println("Cookies dengan Laba Tertinggi: " + cookiesLabaTertinggi +
                " (Rp" + labaTertinggi + ")");
    }
}

            

