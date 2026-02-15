import java.util.Scanner;

public class Pemilihan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt(); 

        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();

        System.out.println("================================");

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        
        // konversi nilai akhir ke dalam huruf

        String huruf;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            huruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            huruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            huruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            huruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        // batas nilai yang valid
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            System.out.println("N ilai yang dimasukkan tidak valid.");
        } else {
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + huruf);
            System.out.println("================================");
        }
        
        // nilai huruf A, B+, B, C+, C = Lulus, jika D, E = Tidak Lulus
        if (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) {
            System.out.println("Selamat! Anda Lulus.");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus.");
        }
    }
}
