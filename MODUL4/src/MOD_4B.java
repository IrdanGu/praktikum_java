/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import javax.swing.JOptionPane;

public class MOD_4B {
    public static void main(String[] args) {
        String hari;
        int angka;

        // Mendapatkan input dari pengguna menggunakan JOptionPane
        String inputAngka = JOptionPane.showInputDialog("Masukkan angka (1-7):");

        // Memeriksa apakah input adalah angka
        try {
            angka = Integer.parseInt(inputAngka);

            // Memastikan angka dalam rentang 1-7
            if (angka >= 1 && angka <= 7) {
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

                // Menampilkan hasil
                JOptionPane.showMessageDialog(null, "Angka yang Anda masukkan adalah: " + angka +
                        "\n yang mewakili hari: " + hari);
            } else {
                JOptionPane.showMessageDialog(null, "Angka harus antara 1 dan 7.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input harus berupa angka!");
        }
    }
}