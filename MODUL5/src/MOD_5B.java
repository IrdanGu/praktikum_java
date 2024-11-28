/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;

public class MOD_5B {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int bil = 1;

        int batas;

        System.out.print("Masukkan batas nilai : ");

        batas = Integer.parseInt(input.nextLine());

        while (bil <= batas) {
            System.out.println("" + bil);
            bil++;
        }
    }
}
