/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import javax.swing.JOptionPane;

public class POST_TEST2 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama");
        String nim = JOptionPane.showInputDialog("Masukkan NIM");
        String prodi = JOptionPane.showInputDialog("Masukkan Program Studi");
        String angkatan = JOptionPane.showInputDialog("Masukkan Angkatan");

        String result = """
                        --- Kartu Tanda Mahasiswa ---
                        Nama: """ + nama + "\n" +
                        "NIM: " + nim + "\n" +
                        "Program Studi: " + prodi + "\n" +
                        "Angkatan: " + angkatan;

        JOptionPane.showMessageDialog(null, result);
    }
}

