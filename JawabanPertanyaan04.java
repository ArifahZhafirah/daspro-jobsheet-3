import java.util.Scanner;
/**
 * JawabanPertanyaan04
 */
public class JawabanPertanyaan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukkan nilai uts ");
        nilaiUts = sc.nextInt();
        System.out.println("Masukkan nilai uas");
        nilaiUas = sc.nextInt(); 

        nilaiAkhir = ( nilaiKuis * 20/100 ) + ( nilaiTugas * 15/100 ) + ( nilaiUts * 30/100 ) + ( nilaiUas * 35/100 );
        
        System.out.println("Nama: " + nama + " NIM " + nim);
        System.out.println("Kelas: " + kelas + " absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}
