/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MOD_2D {
    public static void main(String[] args) throws IOException {
        String nama, mk, prodi;
        String nilai;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Siapa Nama Anda: ");
            nama = bufferedReader.readLine();

            System.out.print("Nama Matakuliah: ");
            mk = bufferedReader.readLine();

            System.out.print("Program Studi: ");
            prodi = bufferedReader.readLine();

            System.out.print("Nilai Anda: ");
            nilai = bufferedReader.readLine();

            System.out.println("--HASIL INPUTAN--");
            System.out.println("Nama\t: " + nama);
            System.out.println("Matakuliah\t: " + mk);
            System.out.println("Program Studi\t: " + prodi);
            System.out.println("Nilai MK\t: " + nilai);

            // If you want to use `nilai` as an integer, you can parse it like this:
            // int nilaiInt = Integer.parseInt(nilai);
        }
    }
}
