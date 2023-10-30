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
public class latihan28 {
public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        System.out.print("Ganti Kata: ");
        String oldWord = input.next();

        System.out.print("Menjadi Kata: ");
        String newWord = input.next();

        String newSentence = sentence.replaceAll(oldWord, newWord);

        System.out.println("----Hasil Formatting----");
        System.out.println("Kalimat awal: " + sentence);
        System.out.println("Kalimat baru: " + newSentence);
    }
}   

