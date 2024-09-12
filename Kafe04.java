import java.util.Scanner;

/**
 * Siakad04
 */
public class Kafe04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.println("Masukkan keanggotaan (true/fals): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembeli kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembeli teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembeli roti: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);



    }
}