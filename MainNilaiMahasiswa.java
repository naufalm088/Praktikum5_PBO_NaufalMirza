/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM Mahasiswa: ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();

        String grade = mahasiswa.getGrade(nilaiAkhir);
        String keterangan = mahasiswa.getKeterangan(grade);

        System.out.println("\n--- Hasil Akhir ---");
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
