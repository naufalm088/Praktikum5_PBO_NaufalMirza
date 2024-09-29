/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class MainPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pembelian Rp: ");
        double totalPembelian = input.nextDouble();

        Pembelian pembelian = new Pembelian(totalPembelian);

        double diskon = pembelian.hitungDiskon();
        double totalBayar = pembelian.hitungTotalBayar(diskon);

        System.out.println("Besarnya potongan Rp: " + diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp: " + totalBayar);
    }
}

