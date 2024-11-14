/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class TUGAS_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();

        double nilaiAkhir = (nilaiTugas + nilaiUTS + nilaiUAS) / 3.0;

        String mutu;

        switch ((int) nilaiAkhir / 10) {
            case 10: case 9:
                mutu = "A";
                break;
            case 8:
                mutu = "B";
                break;
            case 7:
                mutu = "C";
                break;
            case 6: case 5:
                mutu = "D";
                break;
            default:
                mutu = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Mutu: " + mutu);
    }
}