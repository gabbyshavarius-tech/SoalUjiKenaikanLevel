/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel06;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class Ujikenaikanlevel06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Peminjam : ");
        String nama = sc.nextLine();

        System.out.print("Judul Buku : ");
        String judul = sc.nextLine();

        System.out.print("Kategori Buku (A/B/C) : ");
        char kategori = sc.next().toUpperCase().charAt(0);

        System.out.print("Lama Peminjaman (hari) : ");
        int hari = sc.nextInt();

        int tarif = 0;

        switch (kategori) {
            case 'A':
                tarif = 5000;
                break;
            case 'B':
                tarif = 3000;
                break;
            case 'C':
                tarif = 2000;
                break;
            default:
                System.out.println("Kategori tidak valid!");
                return;
        }

        int total = tarif * hari;
        
        System.out.println("\n=== Rincian Peminjaman ===");
        System.out.println("Nama Peminjam : " + nama);
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Lama Pinjam   : " + hari + " hari");
        System.out.println("Tarif per hari: " + tarif);
        System.out.println("Total Biaya : Rp" + total);
}
}

    

