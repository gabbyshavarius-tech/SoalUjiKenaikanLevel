/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujikenaikanlevel04;

/**
 *
 * @author LOQ
 */
public class Ujikenaikanlevel04 {

    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 2, 5};

        boolean adaDuplikat = false;
        int elemenDuplikat = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    adaDuplikat = true;
                    elemenDuplikat = array[i];
                    break;
                }
            }
            if (adaDuplikat) break;
        }

        if (adaDuplikat) {
            System.out.println("Array memiliki elemen duplikat: " + elemenDuplikat);
        } else {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
    }
}
    
