/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */

//  .
import java.util.Scanner;
public class TUGAS_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(input.nextLine());

        String[] nim = new String[jumlahMahasiswa];
        String[] nama = new String[jumlahMahasiswa];
        String[] jurusan = new String[jumlahMahasiswa];
        String[] kelas = new String[jumlahMahasiswa];
        String[] mataKuliah = new String[jumlahMahasiswa];
        double[] nilaiAkhir = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            nim[i] = input.nextLine();
            System.out.print("Nama: ");
            nama[i] = input.nextLine();
            System.out.print("Jurusan: ");
            jurusan[i] = input.nextLine();
            System.out.print("Kelas: ");
            kelas[i] = input.nextLine();
            System.out.print("Mata Kuliah: ");
            mataKuliah[i] = input.nextLine();
            System.out.print("Nilai Akhir: ");
            nilaiAkhir[i] = Double.parseDouble(input.nextLine());
        }

        System.out.println("\nData Nilai Tugas Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("NIM: " + nim[i]);
            System.out.println("Nama: " + nama[i]);
            System.out.println("Jurusan: " + jurusan[i]);
            System.out.println("Kelas: " + kelas[i]);
            System.out.println("Mata Kuliah: " + mataKuliah[i]);
            System.out.println("Nilai Akhir: " + nilaiAkhir[i]);
            System.out.println();
        }

        input.close();
    }
}
