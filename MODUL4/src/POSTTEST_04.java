/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class POSTTEST_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = input.nextInt();

        String mutu;

        switch (nilaiAkhir / 10) {
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

        System.out.println("Mutu: " + mutu);
    }
}