/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import javax.swing.JOptionPane;

public class MOD_2E {
    public static void main(String[] args) {
        String panjang, lebar;
        int luas;

        panjang = JOptionPane.showInputDialog("Masukan Nilai Panjang");
        int pj = Integer.parseInt(panjang);
        
        lebar = JOptionPane.showInputDialog("Masukan Nilai Lebar");
        int lb = Integer.parseInt(lebar);
        
        luas = pj * lb;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = " + luas);
    }
}
