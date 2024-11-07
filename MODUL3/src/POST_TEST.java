/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class POST_TEST {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[][] mahasiswa;
            int jumlah;
            
            System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
            System.out.print("Jumlah Orang : ");
            jumlah = Integer.parseInt(input.nextLine());
            mahasiswa = new String[jumlah][6];
            
            for (int i = 0; i < jumlah; i++) {
                System.out.println("Data Mahasiswa ke -" + (i + 1));
                System.out.print("NIM : ");
                mahasiswa[i][0] = input.nextLine();
                System.out.print("NAMA: ");
                mahasiswa[i][1] = input.nextLine();
                System.out.print("Nilai Tugas: ");
                mahasiswa[i][2] = input.nextLine();
                System.out.print("Nilai UTS: ");
                mahasiswa[i][3] = input.nextLine();
                System.out.print("Nilai UAS: ");
                mahasiswa[i][4] = input.nextLine();
                
                double nilaiTugas = Double.parseDouble(mahasiswa[i][2]);
                double nilaiUTS = Double.parseDouble(mahasiswa[i][3]);
                double nilaiUAS = Double.parseDouble(mahasiswa[i][4]);
                double nilaiAkhir = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;
                
                mahasiswa[i][5] = String.valueOf(nilaiAkhir);
            }
            
            System.out.println("\nNo.\tNIM\tNAMA\tTUGAS\tUTS\tUAS\tNILAI AKHIR");
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + "\t" + mahasiswa[i][0] + "\t" + mahasiswa[i][1] + "\t" + mahasiswa[i][2] + "\t" + mahasiswa[i][3] + "\t" + mahasiswa[i][4] + "\t" + mahasiswa[i][5]);
            }
        }
    }
}
