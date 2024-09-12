import java.util.Scanner;
/**
 * Siakad04
 */
public class Siakad04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        
        System.out.println("Nama: " + nama + " NIM " + nim);
        System.out.println("Kelas: " + kelas + " absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}