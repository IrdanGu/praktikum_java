import javax.swing.JOptionPane;

public class LATIHAN_1 {
    public static void main(String[] args) {
        // Concatenating the message to be displayed in the dialog box
        String message = """
                         KARTU TANDA MAHASISWA
                         
                         PRODI\t\t: SISTEM INFORMASI
                         FAKULTAS\t: FAKULTAS ILMU KOMPUTER
                         UNIVERSITAS\t: UNIVERSITAS KUNINGAN
                         
                         NAMA\t\t: IRDAN GUNTARA
                         NIM\t\t: 20230910042
                         TANGGAL LAHIR\t: 22 MEI 2005
                         """;

        // Display the message using JOptionPane
        JOptionPane.showMessageDialog(null, message);
    }
}
