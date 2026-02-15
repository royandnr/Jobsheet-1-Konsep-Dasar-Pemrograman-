import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        // 1. Inisialisasi Array Satu Dimensi untuk KODE [10]
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        
        // 2. Inisialisasi Array Dua Dimensi untuk KOTA [10][12]
        // Setiap baris mewakili satu kota yang sesuai dengan indeks di array KODE
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        // Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Plat Nomor: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        // Proses pencarian kode di dalam array KODE
        for (int i = 0; i < KODE.length; i++) {
            if (inputKode == KODE[i]) {
                System.out.print("Kota: ");
                // Jika ketemu, cetak seluruh karakter pada baris KOTA ke-i
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, kode plat tidak ditemukan.");
        }
        
        input.close();
    }
}