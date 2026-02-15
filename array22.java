import java.util.Scanner;

public class array22 {

    // fungsi konversi nilai angka ke bobot
    public static double konversiNilai(double nilai) {
        if (nilai > 80) return 4.0;
        else if (nilai > 73) return 3.5;
        else if (nilai > 65) return 3.0;
        else if (nilai > 60) return 2.5;
        else if (nilai > 50) return 2.0;
        else if (nilai > 39) return 1.0;
        else return 0.0;
    }

    // fungsi konversi nilai huruf
    public static String nilaiHuruf(double nilai) {
        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung IP Semester ===");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine(); // buang enter

        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        int[] sks = new int[jumlahMK];
        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama MK        : ");
            namaMK[i] = input.nextLine();

            System.out.print("Nilai Angka    : ");
            nilaiAngka[i] = input.nextDouble();

            System.out.print("Jumlah SKS     : ");
            sks[i] = input.nextInt();
            input.nextLine();

            double bobot = konversiNilai(nilaiAngka[i]);
            totalBobot += bobot * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        // Output
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("=======================================");
        System.out.printf("%-25s %-12s %-12s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-25s %-12.2f %-12s %-10.2f\n",
                    namaMK[i],
                    nilaiAngka[i],
                    nilaiHuruf(nilaiAngka[i]),
                    konversiNilai(nilaiAngka[i]));
        }

        System.out.print("=======================================");
        System.out.printf("\nIP Semester : %.2f\n", ip);

        input.close();
    }
}
