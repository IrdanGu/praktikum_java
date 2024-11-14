/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class MOD_4A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        String hariString = input.nextLine();

        try {
            int angka = Integer.parseInt(hariString);

            String hari;
            switch (angka) {
                case 1: hari = "SENIN"; break;
                case 2: hari = "SELASA"; break;
                case 3: hari = "RABU"; break;
                case 4: hari = "KAMIS"; break;
                case 5: hari = "JUMAT"; break;
                case 6: hari = "SABTU"; break;
                case 7: hari = "MINGGU"; break;
                default: hari = "Angka yang anda masukkan salah!";
            }

            System.out.println("Angka yang Anda masukkan adalah: " + angka +
                    " yang mewakili hari: " + hari);
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}