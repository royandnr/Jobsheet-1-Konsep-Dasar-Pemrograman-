import java.util.Scanner;

public class Perulangan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        // Ambil 2 digit terakhir
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Cetak deret
        for (int i = 1; i <= n; i++) {

            // Skip angka 10 dan 15
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        
        sc.close();
    }
}
