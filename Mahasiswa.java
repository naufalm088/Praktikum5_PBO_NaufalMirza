/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
public class Mahasiswa {
    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public double hitungNilaiAkhir() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public String getGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 76) {
            return "A";
        } else if (nilaiAkhir >= 66) {
            return "B";
        } else if (nilaiAkhir >= 56) {
            return "C";
        } else if (nilaiAkhir >= 46) {
            return "D";
        } else {
            return "E";
        }
    }

    public String getKeterangan(String grade) {
        switch (grade) {
            case "A": return "Istimewa";
            case "B": return "Baik";
            case "C": return "Cukup";
            case "D": return "Kurang";
            case "E": return "Kurang Sekali";
            default: return "Tidak Diketahui";
        }
    }
}
