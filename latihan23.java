/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2part2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latihan23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----Program Nilai Terbesar dan Terkecil Nilai Mahasiswa-----");
        System.out.print("Masukkan Nama Petugas : ");
        String name = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("Petugas " + name);
    }
}    

