/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */

//  Buat program menggunakan konsep array multidimensi untuk mengelola gaji karyawan dengan hasil tampilan program sebagai berikut: 
//  NO   NAMA       JABATAN       GAPOK         TUNJANGAN
//  1    RADIT      DIREKTUR      10.000.000    5.000.000
//  2    JANI       MANAGER       8.000.000     3.500.000

public class TUGAS {

    public static void main(String args[]) {
        String[][] dataKaryawan = {
            {"1", "RADIT", "DIREKTUR", "10.000.000", "5.000.000"},
            {"2", "JANI", "MANAGER", "8.000.000", "3.500.000"}
        };

        System.out.println("NO   NAMA       JABATAN       GAPOK         TUNJANGAN");
        for (String[] dataKaryawan1 : dataKaryawan) {
            for (String dataKaryawan11 : dataKaryawan1) {
                System.out.print(dataKaryawan11 + "    ");
            }
            System.out.println();
        }
    }
}
