/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class MainIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (meter): ");
        double tinggiBadan = input.nextDouble();

        IMT imtObj = new IMT(beratBadan, tinggiBadan);

        double imt = imtObj.hitungIMT();

        String kriteria = imtObj.getKriteria(imt);

        System.out.println("\n--- Hasil IMT ---");
        System.out.println("Indeks Massa Tubuh (IMT): " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
