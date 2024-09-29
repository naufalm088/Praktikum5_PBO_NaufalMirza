/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
public class Pembelian {
    private double totalPembelian;

    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
    }

    public double hitungDiskon() {
        if (totalPembelian >= 50000) {
            return totalPembelian * 0.20; 
        } else {
            return totalPembelian * 0.05;
        }
    }

    public double hitungTotalBayar(double diskon) {
        return totalPembelian - diskon;
    }

    public double getTotalPembelian() {
        return totalPembelian;
    }
}

