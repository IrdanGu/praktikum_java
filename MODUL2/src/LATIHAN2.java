/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class LATIHAN2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nilai Tugas: ");
            double nilaiTugas = input.nextDouble();
            
            System.out.print("Masukkan Nilai UTS: ");
            double nilaiUTS = input.nextDouble();
            
            System.out.print("Masukkan Nilai UAS: ");
            double nilaiUAS = input.nextDouble();
            
            double nilaiAkhir = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;
            
            System.out.println("\n--- Nilai Akhir ---");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
        }
    }
}
