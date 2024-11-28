    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
// Buat program inputan nilai dengan memanfaatkan perulangan dan percabangan, kemudian berikan identitas bilangan ganjil atau bilangan genap. Contoh tampilan:

// 1-> bilangan ganjil

// 2-> bilangan genap

// 3-> bilangan ganjil

// 4-> bilangan genap

// dst
import java.util.Scanner;


public class POSTTEST_04 {
        
        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
        
            int batas;
        
            System.out.print("Masukkan batas nilai : ");
        
            batas = Integer.parseInt(input.nextLine());
        
            for (int bil = 1; bil <= batas; bil++) {
                if (bil % 2 == 0) {
                    System.out.println(bil + " -> bilangan genap");
                } else {
                    System.out.println(bil + " -> bilangan ganjil");
                }
            }
        
        }


}
