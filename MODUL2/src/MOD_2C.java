/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class MOD_2C {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String nama, mk, prodi;
        int nilai;

        System.out.print("Siapa Nama Anda: ");
        nama = input.nextLine();

        System.out.print("Nama Matakuliah: ");
        mk = input.nextLine();

        System.out.print("Program Studi: ");
        prodi = input.nextLine();

        System.out.print("Nilai Anda: ");
        nilai = input.nextInt();

        System.out.println("--HASIL INPUTAN--");
        System.out.println("Nama\t: " + nama);
        System.out.println("Matakuliah\t: " + mk);
        System.out.println("Program Studi\t: " + prodi);
        System.out.println("Nilai MK\t: " + nilai);

        input.close();
    }
}
